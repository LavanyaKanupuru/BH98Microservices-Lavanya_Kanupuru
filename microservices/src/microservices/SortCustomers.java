package microservices;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class SortCustomers {



static List<CreditCard> sortKeys(Set<CreditCard> keyset) {
List<CreditCard> list = new LinkedList<>();
list.addAll(keyset);
Collections.sort(list);
return list;
}



public static void main(String[] args) {
Map<CreditCard, Customer> map = new LinkedHashMap<CreditCard, Customer>();



map.put(new CreditCard(101, "Lavanya", 123, 2025), new Customer("Lavanya", 111));
map.put(new CreditCard(102, "priya", 145, 2024), new Customer("priya", 222));
map.put(new CreditCard(103, "Hema", 133, 2027), new Customer("Hema", 333));
map.put(new CreditCard(104, "Kirti", 126, 2030), new Customer("Kirti", 444));
map.put(new CreditCard(105, "Likitha", 134, 2022), new Customer("Likitha", 555));



Map<CreditCard, Customer> resmap = new LinkedHashMap<CreditCard, Customer>();

List<CreditCard> ls = sortKeys(map.keySet());
for (CreditCard cc : ls) {
resmap.put(cc, map.get(cc));
}
for (CreditCard x : resmap.keySet()) 
{ 
	System.out.println(x); 
}
}
}