package java8;

import java.util.Arrays;

import java.util.List;

public class Names {
	public static void main(String[] args) {
		List<String> mylist=Arrays.asList("Rajesh","Suraj","Tom");
		mylist.stream().map(x -> x+"sharma").forEach(y -> System.out.println(y));
		

}
}
