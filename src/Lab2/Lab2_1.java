package Lab2;

public class Lab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int all=0;
		int i=2;
		int k=1;
		System.out.println('1');
		for(;i<1000;i++,k=1,all=0){
			for(;k<=i/2;k++){
				if(i%k==0)
					all+=k;
			}
			if(i==all)
				System.out.println(i);
		}
	}

}
