import java.util.*;
public class TreeSetDemo{
	public static void main(String[] args){
		TreeSet t=new TreeSet();
		t.add("A");
		t.add("a");
		t.add("E");
		t.add("B");
		t.add("I");
		//t.add(new Integer(10));                 //ClassCastException
		//t.add(null);                 //NullPointerException
		Iterator itr=t.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
