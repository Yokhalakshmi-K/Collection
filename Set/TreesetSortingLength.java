import java.util.*;
class TreesetSortingLength{
	public static void main(String[] args){
		TreeSet t = new TreeSet(new MyComparator());
			t.add("A");
			t.add(new StringBuffer("ABC"));
			t.add(new StringBuffer("AA"));
			t.add("ABCD");
			t.add("XX");
			t.add("A");
			System.out.println(t);
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		String s1=obj1.toString();
		String s2=obj2.toString();
		int len1=s1.length(),len2=s2.length();
		if(len1 < len2)
			return -1;
		else if(len1 > len2)
			return 1;
		else
			return s1.compareTo(s2);
	}
}
