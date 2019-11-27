package Lab6;

interface Car{
	void run();
}

public class Lab6_2 {
	class CarTest implements Car{
		public void run(){
			System.out.println("run");
		}
		public void CarRun(Car ins){
			ins.run();
		}
		public Car doit(){
			class car implements Car{
				car(String a){
					System.out.println("doit_run");
				}
				public void run(){
					System.out.println("doit_run");
				}
			}
			return new car("doit_run");
		}
	}
	
	class OuterClass4{
		public Car doit(){
			return new Car(){
				public void run(){}
				private int i = 0;
				public int getValue(){
					return i;
				}
			};
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
	}

}
