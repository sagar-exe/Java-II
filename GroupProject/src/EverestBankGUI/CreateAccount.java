package EverestBankGUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CreateAccount extends JFrame implements ActionListener {

    JFrame myFrame;
    JLabel lblfname, lbllname, lblage, lbladdress;
    JTextField txtfname, txtlname, txtage, txtaddress;
    JButton btnLogIn, btnClose, btnIcon;
    Font serifFont = new Font("Serif", 1,20);




    public CreateAccount(){
        myFrame = new JFrame("Add account");
        myFrame.setLayout(null);
        myFrame.setSize(600,600);

        Icon icon = new ImageIcon("C:\\Users\\Legion 5\\Downloads\\bank.jpg");
        btnIcon = new JButton(icon);
        btnIcon.setBounds(0,0,400,60);

        lblfname = new JLabel("Enter first name ");
        lblfname.setBounds(20,120,200,30);
        lblfname.setFont(serifFont);

        txtfname = new JTextField();
        txtfname.setBounds(210,120,200,30);
        txtfname.setFont(serifFont);

        lbllname = new JLabel("Enter last name ");
        lbllname.setBounds(20,170,200,30);
        lbllname.setFont(serifFont);

        txtlname = new JTextField();
        txtlname.setBounds(210,170,200,30);
        txtlname.setFont(serifFont);

        lblage = new JLabel("Enter your age ");
        lblage.setBounds(20,230,200,30);
        lblage.setFont(serifFont);

        txtage = new JTextField();
        txtage.setBounds(210,230,200,30);
        txtage.setFont(serifFont);

        lbladdress = new JLabel("Enter your address ");
        lbladdress.setBounds(20,280,200,30);
        lbladdress.setFont(serifFont);

        txtaddress = new JTextField();
        txtaddress.setBounds(210,280,200,30);
        txtaddress.setFont(serifFont);

        btnLogIn = new JButton("Log in");
        btnLogIn.setBounds(20,330,180,30);
        btnLogIn.setFont(serifFont);

        btnClose = new JButton("Close");
        btnClose.setBounds(210,330,180,30);
        btnClose.setFont(serifFont);

        btnLogIn.addActionListener(this);
        btnClose.addActionListener(this);


        myFrame.add(btnIcon);
        myFrame.add(lblfname);
        myFrame.add(lbllname);
        myFrame.add(txtfname);
        myFrame.add(txtlname);
        myFrame.add(lblage);
        myFrame.add(txtage);
        myFrame.add(lbladdress);
        myFrame.add(txtaddress);
        myFrame.add(btnLogIn);
        myFrame.add(btnClose);

        myFrame.setFont(serifFont);


        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnLogIn){
            new LogInPage();

    }else if(e.getSource()==btnClose){
          System.exit(0);
        }}
    public static void main(String[] args) {
        new CreateAccount();
    }
}
