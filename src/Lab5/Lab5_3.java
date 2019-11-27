package Lab5;

/*
final class People{}
class ChinaPeople extends People{}
*/

/*
class People{
	public final void Hello(){}
}
class ChinaPeople extends People{
	public void Hello(){}
}
*/

class Number{
	 public static double P = 3.14;
	 public static final double Q = 3.14;
	 public void num_1(){
		 for(int i = 0;i < 10;i++)
				P++;
			System.out.println(P); 
	 }
	 /*
	 public void num_2(){
		 for(int i = 0;i < 10;i++)
				Q++;
			System.out.println(Q); 
	 }
	 */
}


public class Lab5_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		/*
		final double P = 3.14;
		P = 3.15;
		*/
		
		Number a = new Number();
		a.num_1();
		
		//a.num_2();
	}

}
