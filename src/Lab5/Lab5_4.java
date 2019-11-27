package Lab5;

abstract class door{
	door(){
		System.out.println("这是一扇门");
	}
	public void open(){}
	public void close(){}
}

interface alarm{
	void alarming();
}

class AlarmDoor extends door implements alarm{
	AlarmDoor(){
		System.out.println("继承了door类，也实现了alarm接口。");
	}
	public void open(){
		System.out.println("OPEN!");
	}
	public void close(){
		System.out.println("CLOSE!");
	}
	public void alarming(){
		System.out.println("Ringringring~");
	}
}

public class Lab5_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		AlarmDoor a = new AlarmDoor();
		a.open();
		a.close();
		a.alarming();
	}

}
