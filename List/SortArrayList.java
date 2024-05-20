import java.util.*;
public class SortArrayList{
	public static void main(String[] args){
		List<Integer> list=new ArrayList<Integer>();
		list.add(500);
		list.add(200);
		list.add(100);
		list.add(150);
		/*for(int i:list)
			System.out.println(i);*/
			Collections.sort(list);
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
