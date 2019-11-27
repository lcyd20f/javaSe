package Lab7;
import java.util.Scanner;

class ScoreException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5082943630952899319L;

	public ScoreException(String ErrorMessage){
		super(ErrorMessage);
	}
}
public class Lab7_1 {
	static void ScoreInput(int n) throws ScoreException{
		if (n > 100 || n < 0) {
			throw new ScoreException("ScoreException异常！");
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner cin = new Scanner(System.in);
		System.out.println("输入一个0~100的数字：");
		try {
			ScoreInput(cin.nextInt());
		} catch (ScoreException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println(e);
		}
		cin.close();
	}
}
