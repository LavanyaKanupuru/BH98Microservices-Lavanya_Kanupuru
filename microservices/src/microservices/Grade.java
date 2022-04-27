package microservices;

import java.util.Scanner;

public class Grade {
	
	String name;
	int marks;
	Grade(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	void Student()
	{
		
		if(marks>=100 && marks>=90)
		{
			System.out.println("A");
		}
		else if(marks>=80)
		{
			System.out.println("B");
		}
		else if(marks>=70)
		{
			System.out.println("c");
			
		}
		else
		{
			System.out.println("D");
		}
	}

public static void main(String[] args) {
	System.out.println("enter your marks");
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	System.out.println("enter your name");
	
	String s=sc.next();
	System.out.println("Result: ");
	Grade ps=new Grade(s,t);
	ps.Student();
	
}
	
}