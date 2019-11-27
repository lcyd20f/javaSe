package Lab2;
import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;//树的棵数
		int i = 0;//用来循环
		int count_up = 0;//递增树数
		int count_up_max = 0;//递增最大树数
		int count_up_max_position = 0;//递增最大树位置
		int count_down = 0;//递减树数
		int count_down_max = 0;//递减最大树数
		int count_down_max_position = 0;//递减最大树数位置
		
	//树数输入
		System.out.print("请输入棵数:");
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		
	//树高输入
		int[] tree_height=new int[n];
		System.out.println("输入树的高度：");
		for(i = 0;i < n;i++)
			tree_height[i] = input.nextInt();
		
	//看单调增
		for(i = 0;i < n-1;i++){
			if(tree_height[i] < tree_height[i+1])
				count_up++;
			else
				count_up = 0;
			if(count_up > count_up_max){
				count_up_max = count_up;
				count_up_max_position = i-count_up_max+1;
			}
		}
		
	//看单调减
		for(i = 0;i < n-1;i++){
			if(tree_height[i] > tree_height[i+1])
				count_down++;
			else
				count_down = 0;
			if(count_down > count_down_max) {
				count_down_max = count_down;
				count_down_max_position = i-count_down_max+1;
			}
		}
		
	//位置数要从数组索引号+1
		count_up_max++;
		count_down_max++;
		
	//输出
		System.out.print("( ");
		for(i = count_up_max_position;i < count_up_max_position+count_up_max;i++) 
			System.out.print(tree_height[i] + " ");
		System.out.print(")");
		System.out.println("有" + count_up_max + "棵树高度连续增加");
		
		System.out.print("( ");
		for(i = count_down_max_position;i < count_down_max_position+count_down_max;i++) 
			System.out.print(tree_height[i] + " ");
		System.out.print(")");
		System.out.println("有" + count_down_max + "棵树高度连续减少");
		
		input.close();
	}

}