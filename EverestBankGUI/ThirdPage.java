package EverestBankGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThirdPage extends JFrame implements ActionListener {
    JFrame myFrame;
    JLabel lblLogin, lblUser, lblPassword;
    JTextField txtUser;
    JPasswordField pswPassword;
    JButton btnLogin, btnClose;
    public Font serifFont = new Font("Serif",2,20);


    public ThirdPage(){
        myFrame = new JFrame("Login Page");
        myFrame.setLayout(null);
        myFrame.setSize(600,600);

        lblLogin = new JLabel(" Enter user name and password");
        lblLogin.setBounds(130,100,400,50);
        lblLogin.setFont(serifFont);

        lblUser = new JLabel("User name");
        lblUser.setBounds(50,200,200,50);
        lblUser.setFont(serifFont);

        txtUser = new JTextField();
        txtUser.setBounds(250,200,200,30);
        txtUser.setFont(serifFont);

        lblPassword = new JLabel("Password");
        lblPassword.setBounds(50,300,200,50);
        lblPassword.setFont(serifFont);

        pswPassword = new JPasswordField();
        pswPassword.setBounds(250,300,200,30);

        btnLogin = new JButton("Log in");
        btnLogin.setBounds(30,400,200,50);
        btnLogin.setFont(serifFont);

        btnClose = new JButton("Close");
        btnClose.setBounds(270,400,200,50);
        btnLogin.setFont(serifFont);

        btnLogin.addActionListener(this);
        btnClose.addActionListener(this);

        myFrame.add(lblLogin);
        myFrame.add(lblUser);
        myFrame.add(txtUser);
        myFrame.add(lblPassword);
        myFrame.add(pswPassword);
        myFrame.add(btnLogin);
        myFrame.add(btnClose);

        myFrame.setFont(this.serifFont);
        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ThirdPage();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnLogin){
            new LogInPage();
        }else if(e.getSource()==btnClose){
            System.exit(0);
        }

    }
}
