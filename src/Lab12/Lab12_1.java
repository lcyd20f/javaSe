package Lab12;

import javax.swing.*;

import java.awt.*;
import java.net.URL;

public class Lab12_1 extends JFrame{
	private static final long serialVersionUID = 6779582834594027623L;
	private JLabel jl = new JLabel();
	private static Thread t;
	private int count_x = 0;
	private int count_y = 0;
	private Container container = getContentPane();
	
	public Lab12_1(){
		setBounds(200, 200, 500, 500);
		container.setLayout(null);
		container.setBackground(Color.white);
		URL url = Lab12_1.class.getResource("/img/sf.gif");
		Icon icon = new ImageIcon(url);
		jl.setIcon(icon);
		jl.setHorizontalAlignment(SwingConstants.LEFT);
		jl.setBounds(0, 0, 500, 500);
		jl.setBackground(Color.white);
		jl.setOpaque(true);
		t = new Thread(new Runnable(){
			public void run(){
				while (count_x <= 500 && count_y <= 500){
					jl.setBounds((int)count_x, (int)count_y, 50, 50);
					try{
						Thread.sleep(10);
					}catch(Exception e){
						e.printStackTrace();
					}
					count_x += 60*Math.sin(Math.random()*6.28)*Math.random();
					count_y += 2*Math.random();
					if(count_x >= 500 || count_y >= 500){
						count_x = 0;
						count_y = 0;
					}
				}
			}
		});
		t.start();
		container.add(jl);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Lab12_1();
	}

}
