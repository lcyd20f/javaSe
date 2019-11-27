package Lab6;

interface person{
	void say();
}

class father implements person{
	father(){
		System.out.println("father has been set up.");
	}
	public String name;
	public boolean gender;
	public int age;
	public void say(){
		System.out.println("Chinese");
	}
	public void drive(){
		System.out.println("car");
	}
}

class son extends father{
	son(){
		System.out.println("son has been set up.");
	}
	public String name;
	public boolean gender;
	public int age;
	public void say(){
		System.out.println("English,Chinese");
	}
	public void drive(){
		System.out.println("airplane");
	}
}

public class Lab6_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		father father = new father();
		son son = new son();
		person person_father = father;
		person person_son = son;
		person_father.say();
		person_son.say();
	}

}
