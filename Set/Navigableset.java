import java.util.*;
class Navigableset{
	public static void main(String[] args){
		TreeSet t = new TreeSet();
		t.add(1000);
		t.add(2000);
		t.add(3000);
		t.add(4000);
		t.add(5000);
		System.out.println(t);
		System.out.println(t.floor(2000));
		System.out.println(t.lower(2000));
		System.out.println(t.ceiling(2000));
		System.out.println(t.higher(2000));
		t.pollFirst();
		t.pollLast();
		System.out.println(t.descendingSet());
		System.out.println(t);
	}
}
