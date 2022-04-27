package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Student6{
	private int id;
	private String name;
	private int dept_id;
	private int cmarks,pmarks,mmarks;
	private int total;
	
	public Student6(int id, String name, int dept_id, int cmarks, int pmarks, int mmarks) {
		super();
		this.id = id;
		this.name = name;
		this.dept_id = dept_id;
		this.cmarks = cmarks;
		this.pmarks = pmarks;
		this.mmarks = mmarks;
		this.total=total;
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

	public int getCmarks() {
		return cmarks;
	}

	public void setCmarks(int cmarks) {
		this.cmarks = cmarks;
	}

	public int getPmarks() {
		return pmarks;
	}

	public void setPmarks(int pmarks) {
		this.pmarks = pmarks;
	}

	public int getMmarks() {
		return mmarks;
	}

	public void setMmarks(int mmarks) {
		this.mmarks = mmarks;
	}
	public int gettotal() {
		return mmarks;
	}

	public void settotal(int mmarks) {
		this.mmarks = mmarks;
	}

	@Override
	public String toString() {
		return "Student6 [id=" + id + ", name=" + name + ", dept_id=" + dept_id + "]";
	}
}

public class TestDepartmentMarks {

	public static void main(String[] args) {
		Student6 s1 = new Student6(101,"Sumit",111,90,95,93);
		Student6 s2 = new Student6(102,"Rajesh",111,87,95,93);
		Student6 s3 = new Student6(103,"Suraj",222,66,95,78);
		Student6 s4 = new Student6(104,"Tom",222,79,95,93);
		Student6 s5 = new Student6(105,"Shiva",222,90,78,93);
		Student6 s6 = new Student6(106,"Jay",333,90,95,93);
		Student6 s7 = new Student6(107,"Sagar",333,83,67,93);
		
		List<Student6> students = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);
		for(Student6 st:students)
			st.settotal(st.getCmarks()+st.getMmarks()+st.getPmarks());


			Map<Integer, List<Student6>> studentDeptWise = students.stream().collect(Collectors.groupingBy(Student6::getDept_id));

			System.out.println(studentDeptWise);
			for(List<Student6> st:studentDeptWise.values()) {
			Optional<Student6> studentDeptWise2 = st.stream().collect(Collectors.maxBy(Comparator.comparing(Student6::gettotal)));

			System.out.println(studentDeptWise2);
			}
	}	

}
