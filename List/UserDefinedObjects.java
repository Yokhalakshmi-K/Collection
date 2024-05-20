import java.util.*;
class Employee{
	int empId,age;
	String name;
	Employee(int  empId,String name,int age){
			this.empId=empId;
			this.name=name;
			this.age=age;
	}
	public int getEmpId(){
		return empId;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}

public class UserDefinedObjects{
	public static void main(String[] args){
	ArrayList<Employee> employees = new ArrayList<>();
		String name;
		int age, id;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Enter name(or 'q' to stop:");
			name = scanner.nextLine();
			if(name.toLowerCase().charAt(0) == 'q') {
				break;
			}
			System.out.println("Enter id:");
			id = scanner.nextInt();
			System.out.println("Enter age:");
			age = scanner.nextInt();
			
			employees.add(new Employee(id, name, age));
			scanner.nextLine();
			}
			for(Employee emp:employees){
				System.out.println(emp.getEmpId()+" "+emp.getName()+" "+emp.getAge());
			}
	}
}
