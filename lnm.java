import java.io.*;
class Student
{
	Console con=System.console();
	int reg_no;
	
	int Item[]=new int[5];
	int total;
}
class lnm
{
	public static void main(String args[])
	{
		String a="15BCON141";
		Student s=new Student();
		Console con=System.console();
		System.out.println("Scan Your College ID");
		con.readLine();
		if(a=="15BCON141")
		{
			System.out.println("Welcome Harshit");
		}
		else
		{
			System.out.println("Error");
		}
		System.out.println("Fees Reciept Detail");
		
		      
		
		
		s.Item[0]=20;
		s.Item[1]=40;
		s.Item[2]=60;
		s.Item[3]=80;
		s.Item[4]=100;
		s.total=s.Item[0]+s.Item[1]+s.Item[2]+s.Item[3]+s.Item[4];
		System.out.println("Serial NO."+"\t"+"Name"+"\t\t"+"Exp. in Canteen"+"\t\t"+"Exp. in Laundry"+"\t\t"+"Exp. in Stationary"+"\t\tCollege Fees"+"\tTotal");
		System.out.println("1"+"\t\tHarshit"+"\t\t1200"+"\t\t\t450"+"\t\t\t950"+"\t\t\t\t25000"+"\t\t27600");
		
	}
}
		
		