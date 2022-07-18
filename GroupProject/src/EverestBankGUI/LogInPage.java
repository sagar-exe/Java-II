package EverestBankGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInPage extends JFrame implements ActionListener {
    JFrame myFrame;
    JLabel lblLogin;
    JButton btnContinue;
    JButton btnClose, btnIcon;
    Font serifFont = new Font("Serif", 2,30);



    public LogInPage(){
        myFrame = new JFrame("Everest Bank");
        myFrame.setLayout(null);
        myFrame.setSize(600,600);

        Icon icon = new ImageIcon("C:\\Users\\Legion 5\\Downloads\\bank.jpg");
        btnIcon = new JButton(icon);
        btnIcon.setBounds(10,10,400,60);

        lblLogin = new JLabel("Log in Successful");
        lblLogin.setBounds(150,150,400,50);
        lblLogin.setFont(serifFont);

        btnContinue = new JButton("Please click to continue");
        btnContinue.setBounds(100,280,380,50);
        btnContinue.setFont(serifFont);

        btnClose = new JButton("Close");
        btnClose.setBounds(100,380,380,50);
        btnClose.setFont(serifFont);


        myFrame.add(btnIcon);
        myFrame.add(lblLogin);
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
        if(e.getSource()==btnContinue){
            new SecondPage();
        }else if(e.getSource()==btnClose){
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new LogInPage();
    }
}
