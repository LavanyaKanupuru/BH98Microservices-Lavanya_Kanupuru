package microservices;

import java.util.Scanner;

public class Calc{
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	private int b;
	Calc(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	
void addition(Calc c)
{
	int l1=a+b;
	System.out.println("addition of two numbers" + " "+c.getA()+"+"+c.getB()+" "+"=" +l1);
}
void substraction(Calc c)
{
	int l1=a-b;
	System.out.println("substraction of two numbers"+ " "+c.getA()+"-"+c.getB()+" "+"=" +l1);
}
void multiplication(Calc c)
{
	int l1=a*b;
	System.out.println("multiplication of two numbers"+ " "+c.getA()+"*"+c.getB()+" "+"=" +l1);
}
void division(Calc c)
{
	int l1=a/b;
	System.out.println("division of wo numbers"+ " "+c.getA()+"/"+c.getB()+" "+"=" +l1);
}
public static void main(String args[])
{
	
	Calc c1=new Calc(10,5);
	c1.addition(c1);
	c1.substraction(c1);
	c1.multiplication(c1);
	c1.division(c1);
	
}
	
}