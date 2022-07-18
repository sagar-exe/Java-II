package EvrestBankGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;


public class AddCustomer extends JFrame implements ActionListener {

    JFrame myFrame;
    JLabel lblfname;
    JLabel lbllname;
    JLabel lbladdress;
    JLabel lblage;
    JTextField txtfname;
    JTextField txtlname;
    JTextField txtaddress;
    JTextField txtage;
    JButton btnCustomer;

    JButton btnClose;

    Customer customer = new Customer();


    static FileWriter myWrite;
    public AddCustomer(){
        myFrame = new JFrame("Customer Details");
        myFrame.setLayout(null);
        myFrame.setSize(600, 600);

        lblfname = new JLabel("Enter the first name :");
        lblfname.setBounds(20, 20, 200, 30);

        txtfname = new JTextField();
        txtfname.setBounds(180, 20, 240, 30);

        lbllname = new JLabel("Enter the last name :");
        lbllname.setBounds(20, 60, 200, 30);

        txtlname = new JTextField();
        txtlname.setBounds(180, 60, 240, 30);

        lbladdress = new JLabel("Enter the address :");
        lbladdress.setBounds(20, 100, 200, 30);

        txtaddress = new JTextField();
        txtaddress.setBounds(180, 100, 240, 30);

        lblage = new JLabel("Enter the age :");
        lblage.setBounds(20, 140, 200, 30);

        txtage = new JTextField();
        txtage.setBounds(180, 140, 240, 30);



        btnClose = new JButton("Close");
        btnClose.setBounds(320, 180, 100, 30);


        myFrame.add(lblfname);
        myFrame.add(lbllname);
        myFrame.add(lbladdress);
        myFrame.add(lblage);
        myFrame.add(txtfname);
        myFrame.add(txtlname);
        myFrame.add(txtaddress);
        myFrame.add(txtage);
        myFrame.add(btnClose);

        btnClose.addActionListener(this);

        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AddCustomer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
