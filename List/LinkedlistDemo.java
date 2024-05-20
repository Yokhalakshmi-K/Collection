import java.util.*;
public class LinkedlistDemo{
	public static void main(String[] args){
		LinkedList<String> list=new LinkedList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("Pineapple");
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("Grapes");
		list2.add("Pomegrant");
		list.addAll(list2);
		LinkedList<String> list3=new LinkedList<String>();
		list3.add("Watermelon");
		list3.add("Strawberry");
		list.addAll(1,list3);
		list.addFirst("Fig");
		list.addLast("Fig");
		//System.out.println(list.getFirst());
		//list.addLast("Fig");
	//	System.out.println(list.getLast());
		// list.removeLastOccurrence("Fig");
		// list.removeFirstOccurrence("Fig");
		System.out.println("Elements in list");
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("Elements in reverse");
		Iterator i=list.descendingIterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
