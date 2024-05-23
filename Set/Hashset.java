import java.util.*;
class Entity{
	Object key;
	Entity(Object key){
		this.key = key;
	}
}
public class Hashset{
	private ArrayList<LinkedList<Object>> list;
	private int size;
	private static final int initialCapacity = 10;
	public Hashset(){
		list = new ArrayList<>(initialCapacity);
		for(int i=0;i<initialCapacity;i++){
			list.add(new LinkedList<>());
		}
		size=0;
	}
	public void add(Object key){
		 int hash = (key == null) ? 0 : Math.abs(key.hashCode() % list.size());
        	 LinkedList<Object> bucket = list.get(hash);
		 for(Object entry : bucket){
			if(key != null && key.equals(entry)){
				return;
			}
		}
		bucket.add(key);
		size++;
	}
	public boolean remove(Object key){
		int hash = (key == null) ? 0 : Math.abs(key.hashCode() % list.size());
        	LinkedList<Object> bucket = list.get(hash);
		for(Object entry : bucket){
			if(key != null && key.equals(entry)){
				bucket.remove(entry);
				size--;
				return true;
			}
		}
		return false;
	}
	public boolean contains(Object key){
		int hash = (key == null) ? 0 : Math.abs(key.hashCode() % list.size());
        	LinkedList<Object> bucket = list.get(hash);
		for(Object entry : bucket){
			if(key != null && key.equals(entry)){
				return true;
			}
		}
		return false;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("{ ");
		for(LinkedList<Object> bucket : list){
			for(Object entity : bucket){
				sb.append(entity);
				sb.append(", ");
				
			}
		}
		if(sb.length() > 2){
			sb.setLength(sb.length() - 2);
		}
		sb.append(" }");
		return sb.toString();
		
	}	
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}
}
