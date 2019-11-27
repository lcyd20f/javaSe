package Lab9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;


class window_3 extends window_1{
	private static final long serialVersionUID = 1L;
	public static String s = "";
	public window_3() {
		super();
		super.jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//标题
				s = "<html><body><h1>调查结果</h1><p>";
				
				//账号
				s += "账号："+name.getText()+"<p>";
				
				//密码
				s += "密码："+password.getPassword().toString()+"<p>";
				
				//性别
				if(sexButton_male.isSelected())  s += "性别：男<p>";
				else if (sexButton_female.isSelected())  s += "性别：女<p>";
				else s += "性别：无<p>";

				//爱好
				s += "爱好：";
				if (box1.isSelected()) s+="唱";
				if (box2.isSelected()) s+="跳";
				if (box3.isSelected()) s+="RAP";
				if (box4.isSelected()) s+="篮球";
				s += "<p>";
				
				//学制
				s += "学制："+combox.getSelectedItem().toString()+"<p>";
				
				//校区
				s += "校区："+List.getSelectedValuesList().toString()+"<p>";
				
				//自我介绍
				s += "自我介绍："+area.getText()+"<p>";
				
				s += "</body></html>";
				
				//JDialog
				new MyJDialog(window_3.this).setVisible(true);
				
				
			}
		});
	}
}

class MyJDialog extends JDialog{
	private static final long serialVersionUID = 1L;
	MyJDialog(window_3 frame) {
		super(frame,"结果",true);
		add(new JLabel(window_3.s,SwingConstants.CENTER));
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((int)(screensize.getWidth()/2-150),(int)(screensize.getHeight()/2-150),300,300);
	}
}

public class Lab9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new window_3();
	}

}
