package Lab8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class windows_2 extends JFrame{
	private int i = 1;
	public windows_2() {
		setTitle("简单的图片查看");
		Container c = getContentPane();
		final JLabel jl = new JLabel();
		jl.setIcon(new ImageIcon("src/img/"+i+".jpg "));
		JButton jb1 = new JButton("上一张");
		JButton jb2 = new JButton("下一张");
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				i--;
				if (i == 0) {
					i = 6;
				}
				jl.setIcon(new ImageIcon("src/img/"+i+".jpg "));
			}
		});
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				i++;
				if (i == 7) {
					i = 1;
				}
				jl.setIcon(new ImageIcon("src/img/"+i+".jpg "));
			}
		});
		setLayout(null);
		jl.setBounds(350, 50, 500, 433);
		jb1.setBounds(400, 550, 100, 30);
		jb2.setBounds(700, 550, 100, 30);
		c.add(jl);
		c.add(jb1);
		c.add(jb2);
		setVisible(true);
		setSize(1200, 800);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
public class Lab8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new windows_2();
	}

}
