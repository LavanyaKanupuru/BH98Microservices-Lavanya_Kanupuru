package microservices;

public class EvenOrOdd {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public EvenOrOdd(int a) {
		super();
		this.a = a;
	}
	

void Number1(EvenOrOdd eo)
{
	if(a%2==0) {
        System.out.println(" "+eo.getA()+" is a even number.");
    } else {
        System.out.println(" "+eo.getA()+" is a odd number.");
    }
}


public static void main(String[] args) {
	EvenOrOdd eo1=new EvenOrOdd(20);
	eo1.Number1(eo1);
	
}

}