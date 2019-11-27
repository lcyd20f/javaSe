package Lab11;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Lab11_2 extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel jContentPanel = null;
	private JTextArea jTextArea = null;
	private JPanel controlPanel = null;
	private JButton openButton = null;
	private JButton closeButton = null;
	
	private JPanel getControlPanel() {
		if (controlPanel == null) {
			controlPanel = new JPanel();
		}
		controlPanel.add(getOpenButton());
		controlPanel.add(getCloseButton());
		return controlPanel;
	}
	
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
		}
		return jTextArea;
	}
	
	private JButton getOpenButton() {
		if (openButton == null) {
			openButton = new JButton();
			openButton.setText("写入文件");
			openButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					File file = new File("./src/Lab11/File.txt");
					try {
						FileWriter out = new FileWriter(file);
						String s = jTextArea.getText();
						out.write(s);
						out.close();
					} catch (Exception e1) {
						e1.printStackTrace();
						}
					
				}
			});
		}
		return openButton;
	}
	
	private JButton getCloseButton() {
		if (closeButton == null) {
			closeButton = new JButton();
			closeButton.setText("读取文件");
			closeButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					File file = new File("./src/Lab11/File.txt");
					try {
						FileReader in = new FileReader(file);
						char[] byt = new char[1024];
						int len = in.read(byt);
						jTextArea.setText(new String(byt,0,len));
						in.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					
				}
			});
		}
		return closeButton;
	}
	
	public Lab11_2() {
		super();
		initialize();
	}
	
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getContentPane());
		this.setTitle("JFrame");
		
		this.add(getJContentPane());
		this.setVisible(true);
	}
	
	private JPanel getJContentPane() {
		if (jContentPanel == null) {
			jContentPanel = new JPanel();
			jContentPanel.setLayout(new BorderLayout());
			jContentPanel.add(getJTextArea(),BorderLayout.CENTER);
			jContentPanel.add(getControlPanel(),BorderLayout.SOUTH);
		}
		return jContentPanel;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab11_2 thisClass = new Lab11_2();
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisClass.setVisible(true);
	}

}
