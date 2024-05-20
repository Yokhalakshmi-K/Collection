import java.util.*;
class Book{
	String name;
	int id;
	String author;
	Book(int id,String name,String author){
		this.id=id;
		this.name=name;
		this.author=author;
	}
}
public class BookLinkedlist{
	public static void main(String[] args){
		LinkedList<Book> list=new LinkedList<Book>();
		Book b1=new Book(101,"Let us C","Wiley");
		Book b2=new Book(102,"Networking","James");
		Book b3=new Book(103,"OS","John");
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Book b:list){
			System.out.println(b.id+" "+b.name+" "+b.author);
		} 
	}
}
