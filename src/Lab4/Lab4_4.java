package Lab4;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab4_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("输入第一个数：");
		String str = input.next();
		BigInteger number_1 = new BigInteger(str);
		System.out.println("输入第二个数：");
		str = input.next();
		BigInteger number_2 = new BigInteger(str);
		System.out.println("两数之和为："+number_1.add(number_2));
		System.out.println("两数之差为："+number_1.subtract(number_2));
		System.out.print("第一个数的因子有：");
		int j = 0;
		for (BigInteger i = new BigInteger("2"); 1 == number_1.compareTo(i) && j < 10; i=i.add(new BigInteger("1"))) {
			if(number_1.remainder(i).equals(new BigInteger("0"))) {
				System.out.print(i+" ");
				j++;
			}
		}
	}

}
