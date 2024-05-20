import java.util.*;
class HashMapDemo{
	public static void main(String[] args){
		HashMap m=new HashMap();
		m.put("apple",1);
		m.put("banana",2);
		m.put("papaya",3);
		m.put("pineapple",4);
		System.out.println(m);
		System.out.println(m.put("papaya",10));
		System.out.println(m.keySet());
		System.out.println(m.values());
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()){
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			if(m1.getKey().equals("apple")){
				m1.setValue(20);
			}
			
		}
		System.out.println(m);
	}
}
