package Lab1;
public class Lab1_3 {
	static void F(){
		int N=20;
		int a=0;
		int b=1;
		int c;
		System.out.print(b+" ");
		for(int i=0;i<N;i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		F();
	}
	
}
