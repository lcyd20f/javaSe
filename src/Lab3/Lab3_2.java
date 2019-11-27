package Lab3;

import java.util.Scanner;

public class Lab3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入一个字符串：");
		Scanner input_String = new Scanner(System.in);
		String str = input_String.next();
		str.toUpperCase();
		for (int i = 0 ; i < str.length() ; i++) {
			if (i==str.indexOf(str.charAt(i))) {
				int count = 0;
				for (int j = i ; j < str.length(); j++) {
					if (str.charAt(j)==str.charAt(i))
						count++;
				}
				System.out.println(str.charAt(i)+" "+count+"次");
			}
		}
		input_String.close();
	}

}
