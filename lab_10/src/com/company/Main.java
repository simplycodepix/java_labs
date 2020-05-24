package com.company;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Main {

    private static String getHtmlString(int count) {
        String s = "<html>";
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                s += j + " ";
            }
            s += "<br />";
        }
        s += "</html>";

        return s;
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("HelloWorldSwing");
        JPanel topPanel = new JPanel(new BorderLayout());
        JSlider slider = new JSlider();
        slider.setMinimum(1);
        slider.setMaximum(20);
        slider.setValue(5);

        JPanel bottomPanel = new JPanel(new GridLayout(1, 1));
        JLabel label = new JLabel(getHtmlString(5));

        topPanel.add(slider);
        bottomPanel.add(label);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                label.setText(getHtmlString(value));
            }
        });

        frame.setLayout(new GridLayout(2, 1));
        frame.add(topPanel);
        frame.add(bottomPanel);
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
