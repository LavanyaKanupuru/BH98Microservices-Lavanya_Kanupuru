package microservices;

public class Prime {
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

	public Prime(int num, int i, int count) {
		super();
		this.num = num;
		this.i = i;
		this.count = count;
	}


void Number(Prime pr)
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
	Prime pr1=new Prime(11,2,0);
	pr1.Number(pr1);
}
	
}
