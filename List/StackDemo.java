import java.util.*;
public class StackDemo{
	public static void main(String[] args){
		Stack s=new Stack();
		pushElement(s,10);
		pushElement(s,20);
		pushElement(s,30);
		pushElement(s,40);
		pushElement(s,50);
		pushElement(s,60);
		Iterator itr=s.iterator();
		System.out.println("After pushing element");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("After pop");
		popElement(s);
		System.out.println("After pop");
		popElement(s);
		System.out.println("Is stack is empty?"+s.empty());
		System.out.println("Top element is "+s.peek());
		System.out.println("the element 30 present in position "+s.search(30));
		System.out.println("Sise of stack is "+s.size());
	}
	public static void pushElement(Stack s,int element){
		s.push(new Integer(element));
	}
	public static void popElement(Stack s){
		Integer x=(Integer) s.pop();
		System.out.println(s);
	}
}
