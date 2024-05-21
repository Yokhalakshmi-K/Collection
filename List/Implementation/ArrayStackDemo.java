import java.util.*;
public class ArrayStackDemo{
	public static void main(String[] args){
		Object value;
		ArrayStack stack = new ArrayStack();
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
					stack.push(value);
					break;
				case 2:
					System.out.println(stack.pop()+" is poped");
					break;
				case 3:
					System.out.println("The element is: "+stack.peek());
					break;
				case 4:
					System.out.println("The elements in the stack are");
					stack.display();
					break;
				case 5:
					System.out.println("Enter the value to be searched");
					value = sc.next();
					System.out.println("The element is in "+stack.search(value)+" position");
					break;
				case 6:
					System.exit(0);
					break;
			}
		}
	}
}
class ArrayStack{
	static final int initialCapacity = 30;
	int capacity;
	Object arr[] = new Object[initialCapacity];
	int top;
	ArrayStack(){
		top = -1;
		capacity = initialCapacity;
	}
	public void push(Object value){
		if(top == capacity){
			expandCapacity();
		}
		arr[++top] = value;
	}
	private void expandCapacity(){
		
			capacity = capacity * 2;
			arr = Arrays.copyOf(arr,capacity);
		
	}
	public Object pop(){
		if(isEmpty()){
			throw new IndexOutOfBoundsException("Stack empty");
		}
		return arr[top--];
	}
	public boolean isEmpty(){
		return top == -1;
	}
	public Object peek(){
		if(isEmpty()){
			throw new IndexOutOfBoundsException("Stack empty");
		}
		return arr[top];
	}
	public int search(Object value){
		for(int i=0;i<=top;i++){
			if(arr[i].equals(value)){
				return i;
			}
		}
	return -1;
	}
	public void display(){
		for(int i=0;i<=top;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
