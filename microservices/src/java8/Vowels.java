package java8;

import java.util.Arrays;
import java.util.List;

public class Vowels {
public static void main(String[] args) {



List<String> list = Arrays.asList("lavanya", "priya", "likitha", "ramya");

list.stream().map(str -> {
String x = "";
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
|| ch == 'U' || ch == 'u') {
x = x + str.charAt(i);
}
}
return x;}).forEach(x -> System.out.println(x));

}
}