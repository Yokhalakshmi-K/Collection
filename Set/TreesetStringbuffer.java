import java.util.*;
class TreesetStringbuffer{
	public static void main(String[] args){
		TreeSet t=new TreeSet(new MyComparator());
			t.add(new StringBuffer("Papaya"));
			t.add(new StringBuffer("Pineapple"));
			t.add(new StringBuffer("Apple"));
			t.add(new StringBuffer("Orange"));
			t.add(new StringBuffer("fig"));
			System.out.println(t);
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		String s1=obj1.toString();
		String s2=obj2.toString();
		if(s1<s2)
			return 1;
		else if(s1>s2)
			return -1;
		else
			return 0;
	}
	
}
