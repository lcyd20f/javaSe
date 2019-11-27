package Lab1;
import java.util.*;
public class Lab1_4 {
		static void move(String start_point,String to_point) {
			System.out.println(start_point+"-->"+to_point);
		}
		static void Start(int num,String Left,String Middle,String Right) {
			if(num==1) {
				move(Left,Right);
			}
				
			else {
				Start(num-1,Left,Right,Middle);
				move(Left,Right);
				Start(num-1,Middle,Left,Right);
			}
		}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        in.close();
        System.out.println("²Ù×÷²½ÖèÎª£º");
        Start(num,"Left","Middle","Right");

	}

}
