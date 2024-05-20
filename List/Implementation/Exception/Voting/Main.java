import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("You have votercard ? type yes or no");
		String voterCard=sc.next().toLowerCase();
		try{
			Voter vote=new Voter(name,age,voterCard);
			vote.validate();	
		}catch(ValidateAge e){
			System.out.println(e.getMessage());
		}
	}
}
