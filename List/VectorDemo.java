import java.util.*;
public class VectorDemo{
	public static void main(String[] args){
		Vector vector=new Vector(2,1);
		vector.add("Tiger");
		vector.add("lion");
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		vector.add("elephant");
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		vector.remove(1);
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		
	}
}
