package microservices;

import java.util.Scanner;

public class Calculator{
	int a;
	int b;
	Calculator(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void addition()
	{
		int l1=a+b;
		System.out.println(a+"+"+b+" "+"=" +l1);
	}
	void substraction()
	{
		int l1=a-b;
		System.out.println(a+"-"+b+" "+"=" +l1);
	}
	void multiplication()
	{
		int l1=a*b;
		System.out.println(a+"*"+b+" "+"=" +l1);
	}
	void division()
	{
		int l1=a/b;
		System.out.println(a+"/"+b+" "+"=" +l1);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		Calculator c1=new Calculator(a,b);
		c1.addition();
		c1.substraction();
		c1.multiplication();
		c1.division();
		
	}
		
	}