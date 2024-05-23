import java.util.*;
class Entity{
	Object key;
	Object value;
	Entity(Object key,Object value){
		this.key = key;
		this.value = value;
	} 
}
public class Hashmap{
	ArrayList<LinkedList<Entity>> list;
	private int size = 0;
	Hashmap(){
		list = new ArrayList<>();
		for(int i=0;i<10;i++){
			list.add(new LinkedList<>());
		}
	}
	public void put(Object key,Object value){
		int hash=0;
		if(key == null){
			hash = 0;
		}else{
			hash = Math.abs(key.hashCode() % list.size());
		}
		LinkedList<Entity> entities = list.get(hash);
		for(Entity entry : entities) {
			if(Objects.equals(entry.key,key)){
				entry.value = value;
				return;
			}
		}
		entities.add(new Entity(key,value));
		size++;
	}
	public int size(){
		return size;
	}
	public void remove(Object key){
		int hash=0;
		if(key == null){
			hash = 0;
		}else{
			hash = Math.abs(key.hashCode() % list.size());
		}
		LinkedList<Entity> entities = list.get(hash);
		Entity target = null;
		for(Entity entity : entities){
			if(Objects.equals(entity.key,key)){
				target = entity;
				break;
			}
		}
		entities.remove(target);
		size--;
	}
	public Object get(Object key){
		int hash=0;
		if(key == null){
			hash = 0;
		}else{
			hash = Math.abs(key.hashCode() % list.size());
		}
		LinkedList<Entity> entities = list.get(hash);
		for(Entity entity : entities){
			if(Objects.equals(entity.key , key)){
				return entity.value;
			}
		}
		return null;
	}
	
	public boolean containsKey(Object key){
		return get(key) != null;
	}
	
	public boolean containsValue(Object value){
		for(LinkedList<Entity> entry : list){
			for(Entity entity : entry){
				if(Objects.equals(entity.value , value)){
					return true;
				}
			}
		}
		return false;
	}
	public Object replace(Object key,Object value){
		int hash=0;
		if(key == null){
			hash = 0;
		}else{
			hash = Math.abs(key.hashCode() % list.size());
		}
		LinkedList<Entity> entities = list.get(hash);
		Object temp = null;
		for(Entity entity : entities){
			if(Objects.equals(entity.key , key)){
				temp = entity.value;
				entity.value = value;
				return temp;
			}
		}
		return null;
	}
	public List keySet(){
		ArrayList keys = new ArrayList();
		for(LinkedList<Entity> entry : list){
			for(Entity entity : entry){
				keys.add(entity.key);
			}
		}
		return keys;
	}
	public List values(){
		ArrayList values = new ArrayList();
		for(LinkedList<Entity> entry : list){
			for(Entity entity : entry){
				values.add(entity.value);
			}
		}
		return values;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("{ ");
		for(LinkedList<Entity> bucket : list){
			for(Entity entity : bucket){
				sb.append(entity.key);
				sb.append(" = ");
				sb.append(entity.value);
				sb.append(", ");
				
			}
		}
		if(sb.length() > 2){
			sb.setLength(sb.length() - 2);
		}
		sb.append(" }");
		return sb.toString();
		
	}
}        
