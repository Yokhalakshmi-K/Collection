import java.util.*;
public class ArrayListExample2{
	public static void main(String[] args){
		List<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		/*for(int i:list)
			System.out.println(i);*/
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
