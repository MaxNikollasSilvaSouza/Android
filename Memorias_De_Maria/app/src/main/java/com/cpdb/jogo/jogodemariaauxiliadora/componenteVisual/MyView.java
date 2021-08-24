package com.cpdb.jogo.jogodemariaauxiliadora.componenteVisual;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends androidx.appcompat.widget.AppCompatImageView implements View.OnClickListener {
    private static int virados = 0;

    private static int meuBack = 0;
    private static boolean emClick2 = false;
    private int meuFront;
    private static View m_ultima = null;

    public void setMeuFront(int valor) {
        meuFront = valor;
    }

    public int getMeuFront() {
        return meuFront;
    }

    public static void setMeuBack(int valor) {
        meuBack = valor;
    }

    private View.OnClickListener m_click = null;
    private OnGameListener m_game = null;
    private final int Desvirar = -171294;
    private final int m_tempo = 1200;
    private Handler HH;
    private Object m_lock = new Object();
    private Message m_dado;

    private class depois extends Handler {
        public void handleMessage(Message msg) {

            if (msg.what == Desvirar) {
                MyView.this.setCostas();
                MyView.this.setEnabled(true);
                if (m_ultima != null) {
                    ((MyView) m_ultima).setCostas();
                    ((MyView) m_ultima).setEnabled(true);
                }
                m_ultima = null;
                emClick2 = false;
                if (m_game != null) {
                    synchronized (m_lock) {
                        try {

                            m_game.onErro(MyView.this);
                        } catch (Exception e) {

                        }
                    }

                }
            }
        }
    }

    public void setCostas() {
        if (meuBack != 0)
            this.setImageResource(meuBack);
    }

    public void setOnGameListener(OnGameListener v) {
        m_game = v;
    }

    @Override
    public void setOnClickListener(View.OnClickListener v) {
        m_click = v;
    }

    private void init() {
        m_dado = new Message();
        m_dado.what = Desvirar;


        super.setOnClickListener(this);

    }

    public void onClick(View view) {
        synchronized (m_lock) {

            if (!emClick2) {

                if (virados == 0) {
                    virados++;
                    m_ultima = view;
                    this.setEnabled(false);

                    if (meuFront != 0) {
                        this.setImageResource(meuFront);
                    }
                } else {
                    emClick2 = true;
                    virados = 0;
                    this.setEnabled(false);

                    if (meuFront != 0) {
                        this.setImageResource(meuFront);
                    }
                    if (m_ultima != null) {
                        if (((MyView) m_ultima).getMeuFront() == this.getMeuFront()) {
                            ((MyView) m_ultima).setEnabled(false);
                            this.setEnabled(false);
                            emClick2 = false;
                            if (m_game != null) {
                                synchronized (m_lock) {
                                    try {
                                        m_game.onAcerto(this);
                                    } catch (Exception e) {
                                    }
                                }
                            }
                        } else {
                            m_dado = new Message();
                            m_dado.what = Desvirar;
                            HH = new depois();
                            HH.sendMessageDelayed(m_dado, m_tempo);
                        }
                    }
                }

                if (m_click != null)
                    m_click.onClick(view);
            }
        }
    }

    public MyView(Context context) {
        super(context);
        init();

    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }
}

