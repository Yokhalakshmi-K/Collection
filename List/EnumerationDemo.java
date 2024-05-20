import java.util.*;
public class EnumerationDemo{
	public static void main(String[] args){
		Vector v=new Vector();
		v.add("Apple");
		v.add("Banana");
		v.add("Papaya");
		v.add("Grapes");
		v.add("Orange");
		System.out.println("vector:"+v);
		Enumeration e=v.elements();
		System.out.println("Using enumeration");
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		System.out.println("Print particular elements");
		Enumeration e1=v.elements();
		while(e1.hasMoreElements()){
			String c=(String)e1.nextElement();
			if(c.charAt(0)=='A'){
				System.out.println(c);
			}
		}
	}
}
