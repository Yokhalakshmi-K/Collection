import Exception.CustomException;
class Node{
	Object data;
	Node next;
	Node(Object value){
		data = value;
		next = null;
	}
}
public class Linkedlist  {
	Node head;
	Linkedlist(){
		head = null;
	}
	public void insert(Object value){
		Node newNode=new Node(value);
		if(head == null)
			head = newNode;
		else {
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	public void insertAtBeginning(Object value){
		Node newNode = new Node(value);
		if(head == null)
			head = newNode;
		else{
			newNode.next=head;
			head=newNode;
		}
	}
	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void insertAtPosition(int pos,Object value){
		if(pos == 0){
			insertAtBeginning(value);
			return;
		}
		Node newNode = new Node(value);
		Node temp = head;
		for(int i=1;i<pos;i++){
			temp=temp.next;
			if(temp == null)
				throw new IndexOutOfBoundsException("Invalid psoition");
			
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	public void deleteAtPosition(int pos){
		if(head == null){
			throw new IndexOutOfBoundsException("list is empty");
		}
		if(pos == 0){
			head=head.next;
			return;
		}
		Node temp = head;
		Node prev = null;
		for(int i=1;i<=pos;i++){
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
	}
	public Object get(int pos){
		Node temp = head;
		for(int i=1;i<=pos;i++){
			temp = temp.next;
		}
	return temp.data;
	}
	public void update(int pos,int value){
		Node temp = head;
		for(int i=1;i<=pos;i++){
			temp = temp.next;
		}
		temp.data = value;
	}
	public Object search(Object value){
		Node temp = head;
		int pos=0;
		while(temp != null){
			if(temp.data == value){
				return pos;
			}
			temp=temp.next;
			pos++;
		}
	return -1;
	
	}
	public boolean contains(Object value){
		Node temp = head;
		while(temp != null){
			if(temp.data == value){
				return true;
			}
			temp=temp.next;
		}
	return false;
	}
	public int size(){
		Node temp = head;
		int count = 0;
		while(temp != null){
			count++;
			temp = temp.next;
		}
	return count;
	}
}
