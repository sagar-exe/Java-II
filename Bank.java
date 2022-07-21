import java.util.*;
import java.io.*;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.Date;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
class Bank
{	
	static FileWriter myWrite;
	int opnbal,acno;
	String acnm,adr,em,ph;
	Vector<Integer>tr;
	boolean state;
	// Transaction transac = new Transaction();
	Scanner sc = new Scanner(System.in);
	double amount;
	long accountNo=0;
	private String transactionType;
    private double amount1;
    private long accountNum;
    private Date date;
	Bank()
	{
		acno=0;
		opnbal=0;
		acnm="";
		adr="";
		em="";
		ph="";
		tr = new Vector<Integer>();
		state = false;
	} 
	private List<String> readFile(String filename) {
		List<String> records = new ArrayList<String>();
		  try
		  {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null)
			{
			  records.add(line);
			}
			reader.close();
			return records;
		  }
		  catch (Exception e)
		  {
			System.err.format("Exception occurred trying to read '%s'.", filename);
			e.printStackTrace();
			return null;
		  }
	   }

	   
	
	 public String toString()
	{
		 String s = "\nAccount Data" +"\n\t AccountNumber: "+acno+"\n\t Account Holder's name: " + acnm +"\n\t Address: "+adr+"\n\t Phone Number: "+ph+"\n\t E-Mail: "+em+"\n\t Opening Balance of the Account: "+opnbal+" $"+"\n\t Transcation: "+tr+"\n\t Total balance: "+balance()+" $"+"\n\t Account State: "+state;
		 return s;
	}

	void display()
	{
		JOptionPane.showMessageDialog(null,toString());

	}
	void setData(int no)
	{
        date = new Date();

		acno=no;
		acnm=JOptionPane.showInputDialog(null,"Enter Your Name");
		adr = JOptionPane.showInputDialog(null,"Enter your Address");
		ph = JOptionPane.showInputDialog(null,"Enter Your Phone Number");
		em = JOptionPane.showInputDialog(null,"Enter your email");
		try{

		FileWriter fstream = new FileWriter("BankData.txt", true);
              BufferedWriter out =new BufferedWriter(fstream);
            //   int userId=(int) (findMaxId()+1);
            //   out.write(Integer.toString(userId)+"\n");
              out.write("ACC NO: "+acno+"\n");
              out.write("Name: "+acnm+"\n");
              out.write("Address: "+adr+"\n");
              out.write("Phone: "+ph+"\n");
              out.write("Email:"+em+"\n");
              out.write("Date: "+date+"\n");
              out.write(" \n");
              //Close the output stream
              out.close();
			}catch (IOException e) {
				System.err.println("Caught IOException: " + e.getMessage());
			}
		try
		{
			opnbal = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter opening Balance"));
			JOptionPane.showMessageDialog(null,"Your A/C no. is: "+acno,"Information",JOptionPane.INFORMATION_MESSAGE); 

		}
		catch (Exception e)
		{
		}
		state = true;
	}
	int balance()
	{
		int amt=opnbal;
		int n = tr.size(),i=0;
		while(i<n)
		{
			amt +=tr.get(i);
			i++;
			// FileWriter fstream = new FileWriter("AmountData.txt", true);
			// BufferedWriter ou =new BufferedWriter(fstream);
            // //   int userId=(int) (findMaxId()+1);
            // //   out.write(Integer.toString(userId)+"\n");
			// ou.write("Balance: "+amt+"\n");
		}
		return amt;
			
	}
	void depo()
	{
		int amt=0;
		try
		{
			amt = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter amount"));
		}
		catch (Exception e)
		{
			return;
		}
		if(amt<=0)
			return;
		tr.add(amt);
		JOptionPane.showMessageDialog(null,"Your Total Balance is: " + balance()+ " $");
	}
	void with()
	{
		int amt = 0;
		int bal=balance();
		try
		{
			amt = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter amount"));
		}
		catch (Exception e)
		{
			return;
		}
		if(amt<=0 || (bal-amt)<500)
			return;
		tr.add(-amt);
		JOptionPane.showMessageDialog(null,"Your Total Balance is: " + balance()+ " $");
	}
	void delete()
	{
		state = false;
	}
	boolean getState()
	{
		return state;
	}
	void modify(int no)
	{
		acnm = JOptionPane.showInputDialog(null,"Enter your name");
		adr = JOptionPane.showInputDialog(null,"Enter Your Address");
		ph = JOptionPane.showInputDialog(null,"Enter your Phone Number");
		em = JOptionPane.showInputDialog(null,"Enter your Email");
	}
}













class BankAMD
{
	LinkedList<Bank> obj;
	Bank aobj;
	BankAMD()
	{
		obj = new LinkedList<Bank>();
		aobj = null;
	}
	boolean search(int no)
	{
		int i=0,n=obj.size();
		while(i<n)
		{
			aobj = obj.get(i);
			if(aobj.acno == no)
				break;
			i++;
		}
		return(i!=n);
	}
	void add()
	{
		int no=0;
		try
		{
			// no = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter A/C no."));
			Random r = new Random( System.currentTimeMillis() );
			no=10000 + r.nextInt(20000);
			
		}
		catch (Exception e)
		{
			return;
		}
		if(search(no)==true && aobj.getState()==true)
			JOptionPane.showMessageDialog(null,"Record Already Exists");
		else
		{
			aobj= new Bank();
			aobj.setData(no);
			obj.add(aobj);


		}
	}
	void mod()
	{
		int no=0;
		try
		{
			no = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter A/C no."));
		}
		catch (Exception e)
		{
			return;
		}
		if(search(no)==false || aobj.getState()==false)
			JOptionPane.showMessageDialog(null,"Record Dosen't Exist");
		else
			aobj.modify(no);
	}
	void del()
	{
		int no=0;
		try
		{
			no = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter A/C no."));
		}
		catch (Exception e)
		{
			return;
		}
		if(search(no) == false || aobj.getState()==false)
			JOptionPane.showMessageDialog(null,"Record Dosen't Exist");
		else
			aobj.delete();
	}
	void deposite()
	{
		int no=0;
		try
		{
			no = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter A/C no."));
		}
		catch (Exception e)
		{
			return;
		}
		if(search(no) == false || aobj.getState()==false)
			JOptionPane.showMessageDialog(null,"Record Dosen't Exist");
		else
			aobj.depo();
	}
	void withdraw()
	{
		int no=0;
		try
		{
			no = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter A/C no."));
		}
		catch (Exception e)
		{
			return;
		}
		if(search(no) == false || aobj.getState()==false)
			JOptionPane.showMessageDialog(null,"Record Dosen't Exist");
		else
				aobj.with();
	}
	void dis()
	{
		int no=0;
		try
		{
			no = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter A/C no."));
		}
		catch (Exception e)
		{
			return;
		}
		if(search(no) == false || aobj.getState()==false)
		{
			JOptionPane.showMessageDialog(null,"Record Dosen't Exist");
			return;
		}
		else
			aobj.display();
	}
	void menu()
	{
		int opt=0;
		String[]option=new String[]{"New Account","Modify","Deposite","Withdraw","Delete","Display","Exit"};
		while(true)
		{
			opt=JOptionPane.showOptionDialog(null,"choose option","menu",JOptionPane.YES_OPTION,JOptionPane.PLAIN_MESSAGE,null,option,0);
			if(opt==6)
				break;
			switch(opt)
			{
				case 0:
					add();
					break;
				case 1:
					mod();
					break;
				case 2:
					deposite();
					break;
				case 3:
					withdraw();
					break;
				case 4:
					del();
					break;
				case 5:
					dis();	
					break;
			}
		}
	}
}


class Imp
{
	public static void main(String[]args)
	{
		BankAMD a = new BankAMD();
		a.menu();
		// createFile();
		
	}
	


}