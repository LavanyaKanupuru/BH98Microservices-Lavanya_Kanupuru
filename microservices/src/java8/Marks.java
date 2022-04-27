package java8;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class student5{
	private int id;
	private String name;
	private int dept_id;
	private int marks;
	
	public student5(int id, String name, int dept_id, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.dept_id = dept_id;
		this.marks = marks;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public int getmarks() {
		return marks;
	}

	public void setmarks(int cmarks) {
		this.marks = cmarks;
	}

	
	@Override
	public String toString() {
		return "student5 [id=" + id + ", name=" + name + ", dept_id=" + dept_id + "]";
	}
}

public class Marks{

	public static void main(String[] args) {
		student5 s1 = new student5(101,"Sumit",111,89);
		student5 s2 = new student5(102,"Rajesh",111,70);
		student5 s3 = new student5(103,"Suraj",222,77);
		student5 s4 = new student5(104,"Tom",222,88);
		student5 s5 = new student5(105,"Shiva",222,67);
		student5 s6 = new student5(106,"Jay",333,80);
		student5 s7 = new student5(107,"Sagar",333,65);
		
		List<student5> students = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);
		Map<Integer,List<student5>> mylist=students.stream().filter(x -> x.getmarks()>75).collect(Collectors.groupingBy(student5::getDept_id));
	
		System.out.println(mylist);
	}

}