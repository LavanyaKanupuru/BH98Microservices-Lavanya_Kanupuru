package java8;

import java.util.Arrays;
import java.util.List;

public class Surnames {
public static void main(String[] args) {



List<String> firstname = Arrays.asList("lavanya", "navya","prasanth");
List<String> lastname = Arrays.asList(" kanupuru", " vipuri","Achary");



firstname.stream().map(x -> x + lastname.get(firstname.indexOf(x))).forEach(x -> System.out.println(x)); } }