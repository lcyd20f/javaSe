package Lab9;
import javax.swing.*;
import java.awt.*;

class window_1 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
	final String[] box = {"本科","专科","研究生"};
	final String[] list = {"五山","南海","大学城"};
	JTextField name;//账号框
	JPasswordField password;//密码框
	JRadioButton sexButton_male;//性别按钮
	JRadioButton sexButton_female;//性别按钮
	JCheckBox box1;//爱好按钮
	JCheckBox box2;//爱好按钮
	JCheckBox box3;//爱好按钮
	JCheckBox box4;//爱好按钮
	JComboBox<String> combox;//学制
	JList<String> List;//校区
	JTextArea area;//自我介绍
	JButton jb;//提交按钮
	public window_1(){
		setTitle("用户注册界面");
		setLayout(null);
		
		//标题
		JLabel title = new JLabel("用户注册",SwingConstants.CENTER);
		title.setFont(new Font("黑体", Font.BOLD, 25));
		title.setBounds(0, 0, 600, 50);
		add(title);
		
		//账号
		JPanel Jname = new JPanel(new GridLayout(1,2,5,5));
		JLabel Lname = new JLabel("账号：",SwingConstants.RIGHT);
		name = new JTextField();
		Jname.add(Lname);
		Jname.add(name);
		Jname.setBounds(85,50,300,30);
		add(Jname);
		
		//密码
		JPanel Jpassword = new JPanel(new GridLayout(1,2,5,5));
		JLabel Lpassword = new JLabel("密码：",SwingConstants.RIGHT);
		password = new JPasswordField();
		Jpassword.add(Lpassword);
		Jpassword.add(password);
		Jpassword.setBounds(85,100,300,30);
		add(Jpassword);
		
		//性别
		JPanel Jsex = new JPanel(new GridLayout(1,2,5,5));
		JLabel Lsex = new JLabel("性别：");
		sexButton_male = new JRadioButton("男");
		sexButton_female = new JRadioButton("女");
		ButtonGroup group = new ButtonGroup();
		group.add(sexButton_male);
		group.add(sexButton_female);
		Jsex.add(Lsex);
		Jsex.add(sexButton_male);
		Jsex.add(sexButton_female);
		Jsex.setBounds(193,150,166,30);
		add(Jsex);
		
		//爱好
		JPanel Jhobby = new JPanel(new GridLayout(1,5,5,5));
		JLabel Lhobby = new JLabel("爱好：");
		box1 = new JCheckBox("唱");
		box2 = new JCheckBox("跳");
		box3 = new JCheckBox("RAP");
		box4 = new JCheckBox("篮球");
		Jhobby.add(Lhobby);
		Jhobby.add(box1);
		Jhobby.add(box2);
		Jhobby.add(box3);
		Jhobby.add(box4);
		Jhobby.setBounds(193,200,280,30);
		add(Jhobby);
		
		//学制
		JPanel Jstudy = new JPanel(new GridLayout(1,2,5,5));
		JLabel Lstudy = new JLabel("学制：");
		combox = new JComboBox<String>(box);
		//combox.setSelectedItem(null);
		Jstudy.add(Lstudy);
		Jstudy.add(combox);
		Jstudy.setBounds(193,250,120,30);
		add(Jstudy);
		
		//校区
		JPanel Jposition = new JPanel(new GridLayout(1,2,5,5));
		JLabel Lposition = new JLabel("校区：");
		List = new JList<String>(list);
		List.setBorder(BorderFactory.createLineBorder(Color.black));
		Jposition.add(Lposition);
		Jposition.add(List);
		Jposition.setBounds(193,300,120,60);
		add(Jposition);
		
		//自我介绍
		JPanel Jintroduction = new JPanel(new GridLayout(1,2,0,0));
		JLabel Lintroduction = new JLabel("介绍：",SwingConstants.RIGHT);
		area = new JTextArea();
		JScrollPane js = new JScrollPane(); 
		js.setViewportView(area);
		area.setLineWrap(true);
		area.setBorder(BorderFactory.createLineBorder(Color.black));
		js.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		js.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		Jintroduction.add(Lintroduction);
		Jintroduction.add(js);
		Jintroduction.setBounds(30,380,400,120);
		add(Jintroduction);
		
		//提交
		jb = new JButton("提交");
		jb.setBounds(275, 515, 80, 30);
		add(jb);
		
		setBounds((int)(screensize.getWidth()/2-300),(int)(screensize.getHeight()/2-300),600,600);
		setResizable(false);
		setBackground(Color.white);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}

public class Lab9_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new window_1();
	}

}
