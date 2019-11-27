package Lab8;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.management.loading.PrivateClassLoader;
import javax.script.*;

class Excemple extends JFrame{
	private final String[] a = {"CE","C","AC","/","7","8","9","*","4","5","6","-","1","2","3","+","+/-","0",".","="};
	private final JButton p[] = new JButton[a.length];
	private final String matchString = "[0-9]";
	private String save = "";
	private String s = "";
	int i;
	Container container = getContentPane();
	JTextField jt_1;//下
	JTextField jt_2;//上
	Excemple(){
		setTitle("计算器");
		container.setLayout(new GridLayout(2,1,0,0));
		final JPanel p1=new JPanel(new GridLayout(5,4,1,1));//下
		final JPanel p2=new JPanel(new GridLayout(2,1,0,0));//上
		
		//按钮
		for(int i = 0;i < a.length;i++){
			p[i] = new JButton(""+a[i]);
			p[i].setBackground(Color.lightGray);
			if (a[i].matches(matchString)) {
				p[i].setBackground(Color.white);
			}
			p1.add(p[i]);
		}
		
		//文本框
		jt_1 = new JTextField(s);//下
		jt_2 = new JTextField(save);//上
		jt_1.setHorizontalAlignment(JTextField.RIGHT);
		jt_1.setEditable(false);
		jt_1.setBackground(Color.white);
		jt_1.setFont(new Font("黑体",Font.BOLD,40));
		jt_2.setHorizontalAlignment(JTextField.RIGHT);
		jt_2.setEditable(false);
		jt_2.setBackground(Color.white);
		jt_2.setFont(new Font("黑体",Font.BOLD,18));
		p2.add(jt_2);
		p2.add(jt_1);
		
		//交互
		/*for (i = 1; i < a.length; i++) {
			if (i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 10 || i == 12 || i == 13 || i == 14) {
				p[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						s += a[i];
						jt_1.setText(s);
						jt_1.setHorizontalAlignment(JTextField.RIGHT);
						jt_1.setEditable(false);
						jt_1.setBackground(Color.white);
						jt_1.setFont(new Font("黑体",Font.BOLD,40));
					}
				});
			}
		}*/
		p[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//退格
				if (s.equals("")) {}
				else {
					s = s.substring(0,s.length() - 1);
				}
				jt_1.setText(s);
				jt_1.setHorizontalAlignment(JTextField.RIGHT);
				jt_1.setEditable(false);
				jt_1.setBackground(Color.white);
				jt_1.setFont(new Font("黑体",Font.BOLD,40));
			}
		});
		p[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//全删
				s = "";
				save = "";
				jt_1.setText(s);
				jt_2.setText(save);
				jt_1.setHorizontalAlignment(JTextField.RIGHT);
				jt_1.setEditable(false);
				jt_1.setBackground(Color.white);
				jt_1.setFont(new Font("黑体",Font.BOLD,40));
				jt_2.setHorizontalAlignment(JTextField.RIGHT);
				jt_2.setEditable(false);
				jt_2.setBackground(Color.white);
				jt_2.setFont(new Font("黑体",Font.BOLD,18));
			}
		});
		p[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//除法
				if (s.equals("")) {}
				else if (s.charAt(0) == '-') {
					save += "("+s+")"+"/";
					jt_2.setText(save);
					jt_2.setHorizontalAlignment(JTextField.RIGHT);
					jt_2.setEditable(false);
					jt_2.setBackground(Color.white);
					jt_2.setFont(new Font("黑体",Font.BOLD,18));
					s = "";
					jt_1.setText(s);
				}
				else {
					save += s+"/";
					jt_2.setText(save);
					jt_2.setHorizontalAlignment(JTextField.RIGHT);
					jt_2.setEditable(false);
					jt_2.setBackground(Color.white);
					jt_2.setFont(new Font("黑体",Font.BOLD,18));
					s = "";
					jt_1.setText(s);
				}
			}
		});
		p[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//7
				s += "7";
				jt_1.setText(s);
				jt_1.setHorizontalAlignment(JTextField.RIGHT);
				jt_1.setEditable(false);
				jt_1.setBackground(Color.white);
				jt_1.setFont(new Font("黑体",Font.BOLD,40));
			}
		});
		p[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//8
				s += "8";
				jt_1.setText(s);
				jt_1.setHorizontalAlignment(JTextField.RIGHT);
				jt_1.setEditable(false);
				jt_1.setBackground(Color.white);
				jt_1.setFont(new Font("黑体",Font.BOLD,40));
			}
		});
		p[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//9
				s += "9";
				jt_1.setText(s);
				jt_1.setHorizontalAlignment(JTextField.RIGHT);
				jt_1.setEditable(false);
				jt_1.setBackground(Color.white);
				jt_1.setFont(new Font("黑体",Font.BOLD,40));
			}
		});
		p[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//乘法
				if (s.equals("")) {}
				else if (s.charAt(0) == '-') {
					save += "("+s+")"+"*";
					jt_2.setText(save);
					jt_2.setHorizontalAlignment(JTextField.RIGHT);
					jt_2.setEditable(false);
					jt_2.setBackground(Color.white);
					jt_2.setFont(new Font("黑体",Font.BOLD,18));
					s = "";
					jt_1.setText(s);
				}
				else {
					save += s+"*";
					jt_2.setText(save);
					jt_2.setHorizontalAlignment(JTextField.RIGHT);
					jt_2.setEditable(false);
					jt_2.setBackground(Color.white);
					jt_2.setFont(new Font("黑体",Font.BOLD,18));
					s = "";
					jt_1.setText(s);
				}
			}
		});
		p[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//4
				s += "4";
				jt_1.setText(s);
				jt_1.setHorizontalAlignment(JTextField.RIGHT);
				jt_1.setEditable(false);
				jt_1.setBackground(Color.white);
				jt_1.setFont(new Font("黑体",Font.BOLD,40));
			}
		});
		p[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//5
				s += "5";
				jt_1.setText(s);
				jt_1.setHorizontalAlignment(JTextField.RIGHT);
				jt_1.setEditable(false);
				jt_1.setBackground(Color.white);
				jt_1.setFont(new Font("黑体",Font.BOLD,40));
			}
		});
		p[10].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//6
				s += "6";
				jt_1.setText(s);
				jt_1.setHorizontalAlignment(JTextField.RIGHT);
				jt_1.setEditable(false);
				jt_1.setBackground(Color.white);
				jt_1.setFont(new Font("黑体",Font.BOLD,40));
			}
		});
		p[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//减法
				if (s.equals("")) {}
				else if (s.charAt(0) == '-') {
					save += "("+s+")"+"-";
					jt_2.setText(save);
					jt_2.setHorizontalAlignment(JTextField.RIGHT);
					jt_2.setEditable(false);
					jt_2.setBackground(Color.white);
					jt_2.setFont(new Font("黑体",Font.BOLD,18));
					s = "";
					jt_1.setText(s);
				}
				else {
					save += s+"-";
					jt_2.setText(save);
					jt_2.setHorizontalAlignment(JTextField.RIGHT);
					jt_2.setEditable(false);
					jt_2.setBackground(Color.white);
					jt_2.setFont(new Font("黑体",Font.BOLD,18));
					s = "";
					jt_1.setText(s);
				}
			}
		});
		p[12].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1
				s += "1";
				jt_1.setText(s);
				jt_1.setHorizontalAlignment(JTextField.RIGHT);
				jt_1.setEditable(false);
				jt_1.setBackground(Color.white);
				jt_1.setFont(new Font("黑体",Font.BOLD,40));
			}
		});
		p[13].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2
				s += "2";
				jt_1.setText(s);
				jt_1.setHorizontalAlignment(JTextField.RIGHT);
				jt_1.setEditable(false);
				jt_1.setBackground(Color.white);
				jt_1.setFont(new Font("黑体",Font.BOLD,40));
			}
		});
		p[14].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//3
				s += "3";
				jt_1.setText(s);
				jt_1.setHorizontalAlignment(JTextField.RIGHT);
				jt_1.setEditable(false);
				jt_1.setBackground(Color.white);
				jt_1.setFont(new Font("黑体",Font.BOLD,40));
			}
		});
		p[15].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//加法
				if (s.equals("")) {}
				else if (s.charAt(0) == '-') {
					save += "("+s+")"+"/";
					jt_2.setText(save);
					jt_2.setHorizontalAlignment(JTextField.RIGHT);
					jt_2.setEditable(false);
					jt_2.setBackground(Color.white);
					jt_2.setFont(new Font("黑体",Font.BOLD,18));
					s = "";
					jt_1.setText(s);
				}
				else {
					save += s+"+";
					jt_2.setText(save);
					jt_2.setHorizontalAlignment(JTextField.RIGHT);
					jt_2.setEditable(false);
					jt_2.setBackground(Color.white);
					jt_2.setFont(new Font("黑体",Font.BOLD,18));
					s = "";
					jt_1.setText(s);
				}
			}
		});
		p[16].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//相反数
				if (s.equals("")) {}
				else if (s.charAt(0) == '-') {
					s = s.substring(1,s.length());
				}
				else {
					StringBuilder j = new StringBuilder(s);//构造一个StringBuilder对象
			        j.insert(0, "-");
			        s = j.toString();
				}
				jt_1.setText(s);
				jt_1.setHorizontalAlignment(JTextField.RIGHT);
				jt_1.setEditable(false);
				jt_1.setBackground(Color.white);
				jt_1.setFont(new Font("黑体",Font.BOLD,40));
			}
		});
		p[17].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//0
				if (s.equals("")) {s = "0.";}
				else {s += "0";}
				jt_1.setText(s);
				jt_1.setHorizontalAlignment(JTextField.RIGHT);
				jt_1.setEditable(false);
				jt_1.setBackground(Color.white);
				jt_1.setFont(new Font("黑体",Font.BOLD,40));
			}
		});
		p[18].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//.
				if (s.equals("")) {
					s += "0.";
					jt_1.setText(s);
					jt_1.setHorizontalAlignment(JTextField.RIGHT);
					jt_1.setEditable(false);
					jt_1.setBackground(Color.white);
					jt_1.setFont(new Font("黑体",Font.BOLD,40));
				}
				else if (s.indexOf(".") != -1) {}
				else {
					s += ".";
					jt_1.setText(s);
					jt_1.setHorizontalAlignment(JTextField.RIGHT);
					jt_1.setEditable(false);
					jt_1.setBackground(Color.white);
					jt_1.setFont(new Font("黑体",Font.BOLD,40));
				}
			}
		});
		p[19].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=
				if (save.equals("")) {return;}
				else if (s.charAt(0) == '-') {s = save+"("+s+")";}
				else {s = save + s;}
				try {
					s = new ScriptEngineManager().getEngineByName("JavaScript").eval(s).toString();
				} catch (ScriptException e1) {
					e1.printStackTrace();
				}
				jt_1.setText(s);
				jt_1.setHorizontalAlignment(JTextField.RIGHT);
				jt_1.setEditable(false);
				jt_1.setBackground(Color.white);
				jt_1.setFont(new Font("黑体",Font.BOLD,40));
				save = "";
				jt_2.setText(save);
				jt_2.setHorizontalAlignment(JTextField.RIGHT);
				jt_2.setEditable(false);
				jt_2.setBackground(Color.white);
				jt_2.setFont(new Font("黑体",Font.BOLD,18));
			}
		});
		
		container.add(p2);
		container.add(p1);
		container.setBackground(Color.white);
		setVisible(true);
		setSize(500,700);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}

public class Lab8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Excemple();
	}

}
