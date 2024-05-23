public class HashsetMain{
	public static void main(String[] args){
		Hashset set = new Hashset();
		set.add(51);
		set.add(5);
		set.add(50);
		System.out.println(set);
		set.remove(5);
		System.out.println(set);
		System.out.println(set.contains(50));
		System.out.println(set.size());
		System.out.println(set.isEmpty());
	}
}
