package Lab4;
import java.util.Scanner;
public class Lab4_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int x,y;
		System.out.print("请输入行数：");
		x = input.nextInt();
		System.out.print("请输入列数：");
		y = input.nextInt();
		System.out.print("请输入数组元素：");
		double[][] a = new double[x][y];
		for(int i = 0;i < x;i++){
			for(int j = 0;j < y;j++)
				a[i][j] = input.nextDouble();
		}
		System.out.println("转置后的矩阵为：");
		for(int j = 0;j < y;j++){
			for(int i = 0;i < x;i++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		input.close();
	}

}
