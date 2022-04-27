package microservices;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class GradeArr{
	public static void main(String[] args) {
		List<Integer> studentsmarks=new ArrayList<Integer>();
		studentsmarks.add(76);
		
	Iterator<Integer> itr=studentsmarks.iterator();
	System.out.println("Grade of a student is");
		for(Integer X:studentsmarks) {
			if(X>=100 && X>=90)
			{
				System.out.println("A");
			}
			else if(X>=80)
			{
				System.out.println("B");
			}
			else if(X>=70)
			{
				System.out.println("c");
				
			}
			else
			{
				System.out.println("D");
			}
			}
		}
	}
