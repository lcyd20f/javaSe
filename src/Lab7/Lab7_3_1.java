package Lab7;
import java.awt.*;
import javax.swing.*;
public class Lab7_3_1{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new MyImageIcon_1();
	}

}
 class DrawIcon_1 implements Icon{
	 private int width;
	 private int height;
	 public int getIconWidth()
	 {
		 return this.width;
	 }
	 public int getIconHeight()
	 {
		 return this.height;
	 }
	 public DrawIcon_1(int width,int height)
	 {
		 this.height=height;
		 this.width=width;
	 }
	 public void paintIcon(Component arg0,Graphics arg1,int x,int y)
	 {
		 arg1.fillOval(x, y, width, height);
	 }
 }
 class MyImageIcon_1 extends JFrame{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyImageIcon_1(){
		 setLayout(null);
	 JLabel jl=new JLabel("插入图片",JLabel.LEFT);
	 Icon icon=new ImageIcon("src//moneybag.png");
	 jl.setIcon(icon);
	 jl.setOpaque(true);
	 DrawIcon_1 icon1=new DrawIcon_1(15,15);
		JLabel j=new JLabel("测试",icon1,SwingConstants.RIGHT);
		JFrame jf=new JFrame();
		jf.setLayout(new FlowLayout());
		Container c=jf.getContentPane();
		c.add(j);
		c.add(jl);
		c.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(600, 400);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	 }

 }
