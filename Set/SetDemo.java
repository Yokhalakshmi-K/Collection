import java.util.*;
class SetDemo {
	int a;
	
	SetDemo(int a){
		this.a = a;
		
	}
	public static void main(String[] args){
		
		Set<SetDemo> s= new HashSet<>();
		SetDemo s1 = new SetDemo(10);
		SetDemo s2 = new SetDemo(10);
		
		s.add(s1);
		s.add(s2);
		System.out.println(s);
		
	}
	public int hashCode(){
		final int prime = 3;
		int res = 1;
		res = prime * res + a;
		return res ;
	}
	public boolean equals(Object obj){
		if(this == obj)	
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
	return true;
	}
}
