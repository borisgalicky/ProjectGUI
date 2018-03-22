package sk.akademiasovy.bulb.form;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame =new JFrame("Calculator");
        jFrame.setSize(300,400);
        jFrame.setContentPane(new GUIForm().getPanel());
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}