package com.filecrypto.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecryptPage {
    private JPanel decryptPageView;
    private JLabel lblIcon;
    private JLabel lblName;
    private JLabel lblSize;
    private JButton btnCancel;
    private JButton btnDecrypt;
    private JPasswordField txtPassword;
    private JTextField txtHint;
    private static JFrame frame;
    private static JFileChooser fileChooser;

    public DecryptPage() {
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancel();
            }
        });
        btnDecrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private static void cancel() {
        frame.dispose();
        new MainPage().showMainPage();
    }

    public void showDecryptPage() {
        frame = new JFrame("Decryption");
        frame.setContentPane(new DecryptPage().decryptPageView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300, 300));
        frame.pack();
        frame.setVisible(true);
    }
}
