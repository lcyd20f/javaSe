package Lab3;
import java.util.Random;
public class Lab3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Random random = new Random();
		int s = 97+random.nextInt(25);
		int count = random.nextInt(10000);
		long starTime = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			s = 97+random.nextInt(25);
			str = str + (char)s;
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - starTime;
		System.out.println(str);
		System.out.println("String消耗时间" + time);
		
		StringBuilder builder = new StringBuilder("");
		starTime = System.currentTimeMillis();
		for (int j = 0; j < count; j++) {
			s = 97+random.nextInt(25);
			builder.append((char)s);
		}
		endTime = System.currentTimeMillis();
		time = endTime - starTime;
		System.out.println(builder);
		System.out.println("StringBuilder消耗时间" + time);
	}

}
