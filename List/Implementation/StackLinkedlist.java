import java.util.*;
public class StackLinkedlist{
	public static void main(String[] args){
		Object value;
		LinkedlistStack llstack = new LinkedlistStack();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("\n----------Menu----------\n");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Display");
			System.out.println("5.Search");
			System.out.println("6.Exit");
			System.out.println("-----------------");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter the value to be push");
					value = sc.next();
					llstack.push(value);
					break;
				case 2:
					System.out.println(llstack.pop()+" is poped");
					break;
				case 3:
					System.out.println("The element is: "+llstack.peek());
					break;
				case 4:
					System.out.println("The elements in the stack are");
					llstack.display();
					break;
				case 5:
					System.out.println("Enter the value to be searched");
					value = sc.next();
					System.out.println("The element is in "+llstack.search(value)+" position");
					break;
				case 6:
					System.exit(0);
					break;
			}
		}
	}
}
class Node{
	Object data;
	Node next;
	Node(Object value){
		data = value;
		next=null;
	}
}
class LinkedlistStack{
	Node top;
	LinkedlistStack(){
		top = null;
	}
	public void push(Object value){
		Node newNode = new Node(value);
		newNode.next = top;
		top = newNode;
	}
	public Object pop(){
		if(isEmpty()){
			throw new IndexOutOfBoundsException("Stack is empty");
		}
		Object temp = top.data;
		top = top.next;
	return temp;
	}
	public Object peek(){
		return top.data;
	}
	private boolean isEmpty(){
		return top == null;		
	}
	public void display(){
		Node temp = top;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public int search(Object value){
		Node temp = top;
		int pos = 0;
		while(temp != null){
			if((temp.data).equals(value)){
				return pos;
			}
			temp=temp.next;
			pos++;
		}
	return -1;
	}
}
