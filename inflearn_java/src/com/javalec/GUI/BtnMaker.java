package com.javalec.GUI;

import java.awt.*;

public class BtnMaker extends Frame {
    public static void main(String[] args) {
        BtnMaker btn = new BtnMaker();

//        btn.pack();
        btn.setSize(new Dimension(200,200));
        btn.setVisible(true);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) { }

        btn.setVisible(false);
        btn.dispose();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) { }

        System.exit(0);

    }

    public BtnMaker(){
        Button btn = new Button("Button");
        add(btn);
    }

}
