package EverestBankGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends JFrame implements ActionListener {

    JFrame myFrame;
    JLabel lblEverest;
    JButton btnLogin;
    JButton btnCreate;
    JButton btnClose;
    Font serifFont = new Font("Serif", 2,30);

    public FirstPage(){
        myFrame = new JFrame("Everest Bank");
        myFrame.setLayout(null);
        myFrame.setSize(600,600);

        lblEverest = new JLabel("Welcome to Everest Bank");
        lblEverest.setBounds(150,100,400,50);
        lblEverest.setFont(serifFont);

        btnLogin = new JButton("Log In");
        btnLogin.setBounds(100,240,380,50);
        btnLogin.setFont(serifFont);

        btnCreate = new JButton("Create account");
        btnCreate.setBounds(100,340,380,50);
        btnCreate.setFont(serifFont);

        btnClose = new JButton("Close");
        btnClose.setBounds(100,440,380,50);
        btnClose.setFont(serifFont);


        myFrame.add(lblEverest);
        myFrame.add(btnLogin);
        myFrame.add(btnCreate);
        myFrame.add(btnClose);
        btnLogin.addActionListener(this);
        btnCreate.addActionListener(this);
        btnClose.addActionListener(this);
        myFrame.setFont(this.serifFont);


        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnLogin){
            new ThirdPage();
        }if(e.getSource()==btnCreate){
            new CreateAccount();
        }else if (e.getSource()==btnClose){
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new FirstPage();
    }
}

