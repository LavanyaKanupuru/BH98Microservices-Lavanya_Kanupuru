package microservices;

public class Filtering {
	private static int[] myArray = {3,45,23,78,44,34,88};

	public int[] getMyArray() {
		return myArray;
	}

	public void setMyArray(int[] myArray) {
		this.myArray = myArray;
	}

	public Filtering(int[] myArray) {
		super();
		this.myArray = myArray;
	}


void Numbers(Filtering fi) {
	System.out.println("Even Items in the list are:");
	for (int i=0; i<myArray.length; i++) {
    if(myArray[i]%2 == 0) {
    	
       System.out.println(myArray[i]);
    }
}
}
public static void main(String[] args) {

	Filtering fl=new Filtering(myArray);
	fl.Numbers(fl);
}

}