import java.util.*;
public class DynamicArray{
	public static void main(String[] args){
		int value,position;
		DynamicArrayDemo list=new DynamicArrayDemo();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("---------Menu---------");
			System.out.println("1.Insert element at end");
			System.out.println("2.Display");
			System.out.println("3.Insert element at specified position");
			System.out.println("4.Delete element at specified position");
			System.out.println("5.Delete element at end");
			System.out.println("6.Get the element in specified index");
			System.out.println("7.Update the element");
			System.out.println("8.Search");
			System.out.println("9.Exit");
			System.out.println("------------------------------");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter the element to be inserted");
					value = sc.nextInt();
					list.add(value);
					break;
				case 2:
					System.out.println("Elemets in an array");
					list.display();
					break;
				case 3:
					System.out.println("Enter the element to be inserted in a specified position");
					value=sc.nextInt();
					System.out.println("Enter the position");
					position=sc.nextInt();
					list.insertAt(position,value);
					break;
				case 4:
					System.out.println("Enter the position which element to be deleted");
					position=sc.nextInt();
					list.delete(position);
					break;
				case 5:
					list.deleteAtEnd();
					break;
				case 6:
					System.out.println("Enter the position");
					position=sc.nextInt();
					list.get(position);
					break;
				case 7:
					System.out.println("Enter the element to be inserted in a specified position");
					value=sc.nextInt();
					System.out.println("Enter the position");
					position=sc.nextInt();
					list.update(position,value);
					break;
				case 8:
					System.out.println("Enter the element to be Search");
					value=sc.nextInt();
					if(list.search(value)){
						System.out.println("The element is found");
					}else
						System.out.println("Not found");
					break;
				case 9:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid!!");
			}
		}
		
	}
}
class DynamicArrayDemo{
	static final int initialCapacity=16;
	private int arr[];
	private int size=0;
	private int capacity;
	DynamicArrayDemo(){
		size=0;
		arr=new int[initialCapacity];
		capacity=initialCapacity;
	}
	public void add(int value){
		if(size==capacity){
			expandArray();
		}
		arr[size++]=value;
	}
	 private void expandArray(){
		if(size==capacity){
			capacity=capacity*2;
			arr=Arrays.copyOf(arr,capacity);
		}
	}
	public void display(){
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public void insertAt(int position , int value){
		if(size == capacity){
			expandArray();
		}
		for(int i=size-1;i>=position;i--){
			arr[i+1]=arr[i];
		}
		arr[position]=value;
		size++;
	}
	public void delete(int position) {
		if (position < 0 || position >= size) {
		    throw new IndexOutOfBoundsException("Invalid position: " + position);
		}
		for (int i = position + 1; i < size; i++) {
		    arr[i - 1] = arr[i];
		}
		size--;
	       if(capacity > initialCapacity && capacity > 2*capacity){
	       	shrinkArray();
	       }
        }
	private void shrinkArray(){
	    	capacity = capacity/2;
	    	arr=Arrays.copyOf(arr,capacity);
	}  
	/*public int length(){
		return size;
	}*/
	public void deleteAtEnd(){
		size--;
	}
	public void get(int index){
		for(int i=0;i<size;i++){
			if(i==index)
				System.out.println("The element present in the specified index is:"+arr[i]);
		}
	}
	public void update(int index,int value){
		arr[index]=value;
	}
	public boolean search(int value){
		for(int i=0;i<size;i++){
			if(arr[i] == value){
				return true;
			}
		}
	return false;
	}
}	
