package EverestBankGUI;

import java.io.FileWriter;
import java.io.IOException;

public class AddCustomer extends Thread{
    String fname;
    String lname;
    String address;
    int age;


    public AddCustomer(String fname, String lname, String address, int age){
        this.fname= fname;
        this.lname= lname;
        this.address = address;
        this.age = age;
    }
    private static void addCustomer(Customer customer){
        try{
            FileWriter myWrite = new FileWriter("customer.txt", true);
            myWrite.close();
            System.out.println("Customer Added");
        }catch (IOException E){
            System.out.println(E.getLocalizedMessage());
        }
    }
    @Override
    public void run(){
        AddCustomer addCustomer = new AddCustomer(fname, lname, address, age);
        addCustomer.start();
    }
}
