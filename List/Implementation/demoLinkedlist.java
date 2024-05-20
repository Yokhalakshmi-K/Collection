import java.util.*;
class demoLinkedlist{
	public static void main(String[] args){
		int value,position;
		Linkedlist linkedlist=new Linkedlist(); 
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("\n----------Menu-----------");
			System.out.println("1.Insert at end");
			System.out.println("2.Insert at begining");
			System.out.println("3.Display");
			System.out.println("4.Insert at specified position");
			System.out.println("5.Delete at specified position");
			System.out.println("6.Get the element");
			System.out.println("7.Update value");
			System.out.println("8.Search an element");
			System.out.println("9.Contains an element");
			System.out.println("10.Size of a list");
			System.out.println("11.Exit");
			System.out.println("-------------------------");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter the value to be inserted");
					value=sc.nextInt();
					linkedlist.insert(value);
					break;
				case 2:
					System.out.println("Enter the value to be inserted");
					value=sc.nextInt();
					linkedlist.insertAtBeginning(value);
					break;
				case 3:
					System.out.println("Elements in the list");
					linkedlist.display();
					break;
				case 4:
					System.out.println("Enter the position the element to be inserted");
					position=sc.nextInt();
					System.out.println("Enter the value to be inserted");
					value=sc.nextInt();
					linkedlist.insertAtPosition(position,value);
					break;
				case 5:
					System.out.println("Enter the position the element to be deleted");
					position=sc.nextInt();
					linkedlist.deleteAtPosition(position);
					break;
				case 6:
					System.out.println("Enter the position of the element to be get");
					position=sc.nextInt();
					System.out.println("The element is "+linkedlist.get(position));
					break;
				case 7:
					System.out.println("Enter the position the element to be inserted");
					position=sc.nextInt();
					System.out.println("Enter the value to be inserted");
					value=sc.nextInt();
					linkedlist.update(position,value);
					break;
				case 8:
					System.out.println("Enter the value to be searched");
					value=sc.nextInt();
					System.out.println("The element present at position: "+linkedlist.search(value));
					break;
				case 9:
					System.out.println("Enter the value to be searched");
					value=sc.nextInt();
					if(linkedlist.contains(value)){
						System.out.println("The element is found");
					}else{
						System.out.println("The element is not found");
					}
					break;
				case 10:
					System.out.println("The size of a list is: "+linkedlist.size());
				case 11:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid !!");
					break;
			}
		}
	}
}
