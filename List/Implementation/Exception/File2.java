public class File2  {
	public static void m2(){
		try{
			File1 f=new File1();
			f.m1();
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}
