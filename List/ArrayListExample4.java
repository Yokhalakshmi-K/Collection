import java.util.*;
public class ArrayListExample4{
	public static void main(String[] args){
		List<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		Iterator itr=list.iterator();
		list.forEach(a->
			{
				System.out.println(a);
				});
				itr.forEachRemaining(a->
			{
				System.out.println(a);
				});
	}
}
