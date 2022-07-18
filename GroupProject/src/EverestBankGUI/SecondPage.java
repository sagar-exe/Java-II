package EverestBankGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage extends JFrame implements ActionListener {
    JFrame myFrame;
    JButton b1, b2, b3, b4, b5;
    Font serifFont = new Font("Serif", 2,20);


    public SecondPage(){
        myFrame = new JFrame("Menu Driven");
        myFrame.setLayout(new BorderLayout(20,20));
        Icon icon = new ImageIcon("C:\\Users\\Legion 5\\Downloads\\bank.jpg");
        b1 = new JButton(icon);
        


        b1.setFont(serifFont);
        b2 = new JButton("Display all details");

        b2.setFont(serifFont);
        b3 = new JButton("Withdraw ");
        b3.setFont(serifFont);
        b4 = new JButton("Check Balance");
        b4.setFont(serifFont);
        b5 = new JButton("Search customer");
        b5.setFont(serifFont);

        myFrame.setSize(600,600);
        myFrame.add(b1,"North");
        b1.setPreferredSize(new Dimension(200,150));
        myFrame.add(b2,"South");
        b2.setPreferredSize(new Dimension(200,150));
        myFrame.add(b3,"East");
        b3.setPreferredSize(new Dimension(180,150));
        myFrame.add(b4,"West");
        b4.setPreferredSize(new Dimension(180,150));

        myFrame.add(b5,"Center");
        b5.setPreferredSize(new Dimension(90,150));

        myFrame.setFont(serifFont);


        b1.addActionListener(this );
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        new SecondPage();
    }




    @Override
    public void actionPerformed(ActionEvent e) {





    }



}
