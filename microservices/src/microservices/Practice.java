package microservices;

import java.util.Scanner;

public class Practice {
	private int num, i, count=0;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Practice(int num, int i, int count) {
		super();
		this.num = num;
		this.i = i;
		this.count = count;
	}


void Number(Practice pr)
{
	 for(i=2; i<num; i++)
     {
        if(num%i == 0)
        {
           count++;
           break;
        }
     }
     
     if(count==0)
        System.out.println("\nIt is a Prime Number.");
     else
        System.out.println("\nIt is not a Prime Number.");
  }

public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner scann=new Scanner(System.in);
	int num=scann.nextInt();
	Practice ps=new Practice(num,2,0);
	ps.Number(ps);
}
	
}


