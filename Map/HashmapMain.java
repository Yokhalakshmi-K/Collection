public class HashmapMain{
	public static void main(String[] args){
		Hashmap map = new Hashmap();
		map.put(null,"java");
		map.put(2,"c++");
		map.put(3,"mango");
		map.put(null,"apple");
		map.put(5,"orange");
		map.put(2,"lichi");
		map.put(4,"strawberry");
		System.out.println(map);
		map.remove(null);
		System.out.println(map);
		System.out.println(map.get(3));
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("papaya"));
		System.out.println(map.replace(null,"jack fruit"));
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
	}
}
