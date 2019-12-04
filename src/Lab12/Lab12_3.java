package Lab12;

public class Lab12_3 extends Thread{
	private static Thread t;
	private static Thread s;
	Lab12_3(){
		t = new Thread(new Runnable(){
			public void run(){
				while(true){
					System.out.println("线程t出生");
					System.out.println("线程t开始休眠1s");
					try{
						Thread.sleep(1000);
					}catch(Exception e){
						e.printStackTrace();
					}
					System.out.println("线程t休眠结束");
					System.out.println("另一个线程s加入");
					try{
						s.start();
						s.join();
					}catch(Exception e){
						e.printStackTrace();
					}
					System.out.println("另一个线程s结束");
					System.out.println("线程t中断");
					break;
				}
			}
		});
		t.start();
		s = new Thread(new Runnable(){
			public void run(){
				while(true){
					System.out.println("线程s出生");
					System.out.println("线程s开始休眠1s");
					try{
						Thread.sleep(1000);
					}catch(Exception e){
						e.printStackTrace();
					}
					System.out.println("线程s休眠结束");
					break;
				}
			}
		});
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Lab12_3();
	}

}
