package microservices;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class FilteringArr{
	public static void main(String[] args) {
		List<Integer> mylist=new ArrayList<Integer>();
		mylist.add(3);
		mylist.add(45);
		mylist.add(23);
		mylist.add(78);
		mylist.add(44);
		mylist.add(34);
	Iterator<Integer> itr=mylist.iterator();
	System.out.println("Even Items in the given arraylist is:");
		for(Integer X:mylist) {
			if(X%2 == 0) {
			       System.out.println(X);
			    }
			}
		}
	}
