package EvrestBankGUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends JFrame implements ActionListener {

    JFrame myFrame;
    JLabel lblEverest;
    JButton btnContinue;
    JButton btnClose;
    Font serifFont = new Font("Serif", 2,30);

    public FirstPage(){
        myFrame = new JFrame("Everest Bank");
        myFrame.setLayout(null);
        myFrame.setSize(600,600);

        lblEverest = new JLabel("Welcome to Everest Bank");
        lblEverest.setBounds(150,150,400,50);
        lblEverest.setFont(serifFont);

        btnContinue = new JButton("Please click to continue");
        btnContinue.setBounds(100,280,380,50);
        btnContinue.setFont(serifFont);

        btnClose = new JButton("Close");
        btnClose.setBounds(100,380,380,50);
        btnClose.setFont(serifFont);


        myFrame.add(lblEverest);
        myFrame.add(btnContinue);
        myFrame.add(btnClose);
        btnContinue.addActionListener(this);
        btnClose.addActionListener(this);
        myFrame.setFont(this.serifFont);


        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if
        (e.getSource()==this.btnContinue){
            new SecondPage();

        }else if (e.getSource()==btnClose){
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new FirstPage();
    }
}
