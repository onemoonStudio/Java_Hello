package com.javalec.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MakeFrame extends Frame implements ActionListener {

    public static void main(String[] args) {
        MakeFrame mkFrame = new MakeFrame();
        mkFrame.setSize(new Dimension(500,500));
        mkFrame.setVisible(true);
    }

    private List list;
    private Panel panel;
    private TextField textField;
    private Button okButton;
    private Button exitButton;


    public MakeFrame(){

        list = new List();
        panel = new Panel();
        textField = new TextField(20);
        okButton = new Button(" OK ! ");
        exitButton = new Button(" BYE ~ ");

        setLayout(new BorderLayout());
        add(panel , BorderLayout.NORTH);
        add(list , BorderLayout.CENTER);

        panel.add(new Label("write"));
        panel.add(textField);
        panel.add(okButton);
        panel.add(exitButton);

        okButton.addActionListener(this);
        exitButton.addActionListener(this);
        // addActiondListener 가 implements의 ActionListner를 통해서 Override된 actionPerfomed로 넘어가게 된다.

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == okButton ){
            list.add(textField.getText());
            textField.setText("");
            // 좀더 자연스럽게 텍스트를 삭제함
        }else if(e.getSource() == exitButton){
            setVisible(false);
            dispose();
            System.exit(0);
        }
    }
}
