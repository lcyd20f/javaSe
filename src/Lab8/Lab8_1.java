package Lab8;
import javax.swing.*;
import java.awt.*;
class window extends JFrame{
	window(){
		JFrame jf = new JFrame("九九表");
		Container container = jf.getContentPane();
		JLabel jl = new JLabel();
		StringBuilder s = new StringBuilder("<html>");
		for (int j = 1; j < 10; j++) {
			for (int i = 1; i < j+1; i++) {
				s.append(String.valueOf(i)+"*"+String.valueOf(j)+"="+String.valueOf(i*j)+" ");
			}
			s.append("<br>");
		}
		s.append("</html>");
		
		jl.setText(s.toString());
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(800, 600);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}

public class Lab8_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new window();
	}

}
