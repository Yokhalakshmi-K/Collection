public class Voter{
	String name;
	int age;
	String voterCard;
	Voter(String name,int age,String voterCard){
		this.name=name;
		this.age=age;
		this.voterCard=voterCard;
	}
	 void validate() throws ValidateAge{
	 		if(age <= 0){
	 			throw new ValidateAge("You enter invalid age");
	 		}
			else if(age < 18){
				throw new ValidateAge("Age is less than 18 so you are not allowed");
				
			} else if(voterCard.equals("no")){
				throw new ValidateAge("You are not allowed to vote voterCard is must!!");
			}
			else{
				System.out.println("Eligible to vote");
			}
		}
}
