package microservices;

import java.util.*;
public class Student{ 



public static void main(String[] args) {
int[] rollnum= {29,23,22};
System.out.println("--unsorted--");
for(int i=0;i<rollnum.length;i++)
{
System.out.println(rollnum[i]);
}
Arrays.sort(rollnum);
System.out.println("--sorted--");
for(int i=0;i<rollnum.length;i++)
{
System.out.println(rollnum[i]);



}



}
}