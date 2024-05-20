import java.util.*;
public class HashsetDemo{
	public static void main(String[] args){
		ArrayList<String> list=new ArrayList<String>();
		list.add("yokhs");
		list.add("helen");
		list.add("yokhs");
		LinkedHashSet<String> set=new LinkedHashSet<String>(list);
		set.add("Apple");
		set.add("Papaya");
		set.add("Orange");
		set.add("Pineapple");
		//set.add("Apple");
		//set.removeIf(str->str.contains("Papaya"));
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
