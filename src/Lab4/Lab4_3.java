package Lab4;
import java.util.Random;
public class Lab4_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random random = new Random();
		int count_1 = 0;
		int count_2 = 0;
		int count_3 = 0;
		int count_4 = 0;
		int count_5 = 0;
		int count_6 = 0;
		for(int i = 0;i < 100000;i++){
			int s = 1 + random.nextInt(6);
			switch(s){
			case 1:count_1++;break;
			case 2:count_2++;break;
			case 3:count_3++;break;
			case 4:count_4++;break;
			case 5:count_5++;break;
			case 6:count_6++;break;
			}
		}
		int big = count_4 + count_5 + count_6;
		int small = count_1 + count_2 + count_3;
		System.out.println("1的个数有:"+count_1);
		System.out.println("2的个数有:"+count_2);
		System.out.println("3的个数有:"+count_3);
		System.out.println("4的个数有:"+count_4);
		System.out.println("5的个数有:"+count_5);
		System.out.println("6的个数有:"+count_6);
		System.out.println("大的个数有:"+big);
		System.out.println("小的个数有:"+small);
	}

}
