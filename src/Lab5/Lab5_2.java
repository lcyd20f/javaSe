package Lab5;

class People{
	public void speakHello(){
		System.out.println("I'm People.");
	}
	public void averageHeight(){
		height = 180;
		System.out.println("AverageHeight is "+height+"cm.");
	}
	public void averageWeight(){
		weight = 65;
		System.out.println("AverageWeight is "+weight+"kg.");
	}
	protected double height,weight;
}

class ChinaPeople extends People{
	public void speakHello(){
		System.out.println("I'm ChinaPeople.");
	}
	public void chinaGongfu(){
		System.out.println("I can do China Gongfu.");
	}
}

public class Lab5_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		People a = new People();
		ChinaPeople b = new ChinaPeople();
		System.out.println("Now it's People time.");
		a.speakHello();
		a.averageHeight();
		a.averageWeight();
		System.out.println("Now it's ChinaPeople time.");
		b.speakHello();
		b.chinaGongfu();
		b.averageHeight();
		b.averageWeight();
	}

}
