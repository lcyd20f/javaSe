package Lab7;

import javax.swing.*;
import java.awt.*;
public class Lab7_4_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Excemple();
	}

}
 
class Excemple extends JFrame
{
	Excemple(){
	setTitle("计算器");
	Container container = getContentPane();
	container.setLayout(new GridLayout(2,1,0,0));
    JPanel p1=new JPanel(new GridLayout(6,4,1,1));
    JPanel p2=new JPanel(new GridLayout(6,1,1,1));
    String a[]= new String[]{"%","Sqrt","Square","1/x","CE","C","AC","/","7","8","9","*","4","5","6","-","1","2","3","+"," ","0",".","="};
    for(int i=0;i<24;i++){
    	JButton p=new JButton(""+a[i]);
    	p.setBackground(Color.lightGray);
    	p1.add(p);
    	
    }
    //JButton p3=new JButton("dfa");
    //p2.add(p3);
    p1.setPreferredSize(new Dimension(900,500));
    container.add(p2);
    container.add(p1);
	container.setBackground(Color.white);
	setVisible(true);
	setSize(510,700);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}