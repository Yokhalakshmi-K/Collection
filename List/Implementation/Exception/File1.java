import java.util.Scanner;
public class File1 {
	
	public static void m1(){
		int dividend =10;
		int divisor = 10;
		if(divisor == 0){
			throw new ArithmeticException("/ by zero");
		}
		int ans= dividend / divisor;
		System.out.println(ans);
	}
}


