package Lab2;
import java.util.Scanner;
public class Lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] normal_year=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};//普通年
		int[] special_year=new int[]{31,29,31,30,31,30,31,31,30,31,30,31};//闰年
		
		int i=0;
		int year=0;
		int month=0;
		int date=0;
		int day=0;
		
		System.out.print("请输入年份:");
		Scanner input1 = new Scanner(System.in);
		year=input1.nextInt();
		input1.close();
		
		System.out.print("请输入月份:");
		Scanner input2 = new Scanner(System.in);
		month=input2.nextInt();
		input2.close();
		
		System.out.print("请输入日期:");
		Scanner input3 = new Scanner(System.in);
		date=input3.nextInt();
		input3.close();
		
		if(year%400==0||year%4==0&&year%100!=0){//闰年
			for(i=0;i<month-1;i++){
				day+=special_year[i];
			}
			day+=date;
		}
		else{//普通年
			for(i=0;i<month-1;i++){
				day+=normal_year[i];
			}
			day+=date;
		}
		
		System.out.println("判断这一天是这一年的第"+day+"天");
	}

}
