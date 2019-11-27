package Lab3;
import java.util.Scanner;
public class Lab3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String moddle = "[^0]\\d{4,10}";
		Scanner input_String;
		while(true) {
			System.out.println("请输入QQ号：");
			input_String = new Scanner(System.in);
			String str = input_String.next();
			if(str.matches(moddle)) {
				System.out.println("是正确的QQ号！");
				break;
			}
			else
				System.err.println("不是正确的QQ号！");
		}
		input_String.close();
	}

}
