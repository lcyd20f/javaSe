package Lab8;
import javax.swing.*;

import java.awt.*;
class windows_1 extends JFrame{
	public windows_1() {
		setTitle("使用边界布局管理器与网格布局管理器");
		Container container = getContentPane();
		JButton jb1 = new JButton("上");
		JButton jb2 = new JButton("下");
		JButton jb3 = new JButton("左");
		JButton jb4 = new JButton("右");
		container.add(BorderLayout.NORTH,jb1);
		container.add(BorderLayout.SOUTH,jb2);
		container.add(BorderLayout.WEST,jb3);
		container.add(BorderLayout.EAST,jb4);
		container.setBackground(Color.white);
		JPanel p = new JPanel(new GridLayout(3, 3, 5, 5));
		for (int i = 1; i < 10; i++) {
			p.add(new JButton("按钮"+i));
		}
		container.add(p);
		setVisible(true);
		setSize(800, 600);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
public class Lab8_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new windows_1();
	}

}
