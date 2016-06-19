package com.company;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StartingClass extends Applet implements Runnable, KeyListener {
    @Override
    public void init() {
        setSize(800, 480);
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
        Frame frame = (Frame) this.getParent().getParent();
        frame.setTitle("Q-Bot Alpha");
        super.init();
    }

    @Override
    public void start() {
        Thread thread = new Thread(this);
        thread.start();
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_KP_UP:
                System.out.println("Move up");
                break;
            case KeyEvent.VK_KP_DOWN:
                System.out.println("Move down");
                break;
            case KeyEvent.VK_KP_LEFT:
                System.out.println("Move left");
                break;
            case KeyEvent.VK_KP_RIGHT:
                System.out.println("Move right");
                break;
            case KeyEvent.VK_SPACE:
                System.out.println("Jump");
                break;
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_KP_UP:
                System.out.println("Stop moving up");
                break;
            case KeyEvent.VK_KP_DOWN:
                System.out.println("Stop moving down");
                break;
            case KeyEvent.VK_KP_LEFT:
                System.out.println("Stop moving left");
                break;
            case KeyEvent.VK_KP_RIGHT:
                System.out.println("Stop moving right");
                break;
            case KeyEvent.VK_SPACE:
                System.out.println("Stop jumping");
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

}
