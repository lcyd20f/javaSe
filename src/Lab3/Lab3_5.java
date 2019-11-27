package Lab3;
import java.util.Scanner;
import java.util.Random;

class Dice{
	public int point;
	public int money;
	public Dice() {
		point = 0;
		money = 10000;
	}
	public void throw_point() {
		Random random = new Random();
		this.point = 0;
		for (int i = 0; i < 3; i++) {
			this.point += 1 + random.nextInt(5);
		}
	}
	public String confirm_point() {
		String confirm;
		if(this.point >= 10)
			confirm = "大";
		else
			confirm = "小";
		return confirm;
	}
}


public class Lab3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice loser = new Dice();
		System.out.println("你有10000金币，请输入“大”或“小”开始投注，输入“不玩了”退出游戏：");
		Scanner input = new Scanner(System.in);
		String x;
		while(true){
			x = input.next();
			if(x.equals("大") || x.equals("小")){
				loser.throw_point();
				if(x.equals(loser.confirm_point())){
					loser.money += 800;
					System.out.println("恭喜你！金币+800！当前金币为" + loser.money);
				}
				else{
					loser.money -= 1000;
					System.out.println("很遗憾！金币-1000！当前金币为" + loser.money);
				}
				continue;
			}
			else if (x.equals("不玩了"))
				break;
			else
				System.err.println("请重新输入！");
		}
		System.out.println("游戏结束！当前金币为" + loser.money);
		input.close();
	}

}
