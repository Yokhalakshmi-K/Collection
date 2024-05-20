import java.util.*;
public class IteratorDemo{
	public static void main(String[] args){
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(25);
		list.add(30);
		list.add(45);
		list.add(55);
		list.add(65);
		list.add(70);
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			Integer i=(Integer) itr.next();
			if(i%2 != 0){
				System.out.println(i);
			}
		}
		while(itr.hasNext()){
			Integer i=(Integer) itr.next();
			if(i%2 != 0){
				System.out.println(i);
			}
		}	
		
		
		System.out.println(list);		
	}
}
