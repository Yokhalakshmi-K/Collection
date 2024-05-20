import java.util.*;
public class ArrayListDemo{
	public static void main(String[] args){
		ArrayList list=new ArrayList();
		list.add(10);
		list.add('A');
		list.add('B');
		list.add('A');
		System.out.println(list);
		list.remove(2);           //remove the value present in index 2
		System.out.println(list);
		list.add(1,"Bob");
		System.out.println(list);
		System.out.println(list.get(1));      //get the value present in 1st index
		list.set(3,20);            //set 20 in index 3
		System.out.println(list);
		list.add('A');
		System.out.println(list);
		System.out.println(list.indexOf('A'));      // returns first index
		System.out.println(list.lastIndexOf('A'));         // returns last index
	}
}
