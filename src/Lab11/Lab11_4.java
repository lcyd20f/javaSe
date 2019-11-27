package Lab11;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Lab11_4 extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel jContentPanel = null;
	private JTextArea jTextArea = null;
	private JPanel controlPanel = null;
	private JButton openButton = null;
	private JButton closeButton = null;
	private JButton readButton = null;
	
	private JPanel getControlPanel() {
		if (controlPanel == null) {
			controlPanel = new JPanel();
		}
		controlPanel.add(getOpenButton());
		controlPanel.add(getCloseButton());
		controlPanel.add(getReadButton());
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
	
	private JButton getReadButton() {
		if (readButton == null) {
			readButton = new JButton();
			readButton.setText("打开文件");
			readButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser fc=new JFileChooser();
					JTextArea msgTextArea = new JTextArea();
					fc.setCurrentDirectory(new File("./src/Lab11"));															//设置默认路径
					fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);												//设置选择模式（只选文件、只选文件夹、文件和文件均可选）
					fc.setMultiSelectionEnabled(true);																			//是否允许多选
					fc.addChoosableFileFilter(new FileNameExtensionFilter("zip(*.zip, *.rar)", "zip", "rar"));					//文件过滤器
					fc.addChoosableFileFilter(new FileNameExtensionFilter("image(*.jpg, *.png, *.gif)", "jpg", "png", "gif"));	//文件过滤器
					fc.setFileFilter(new FileNameExtensionFilter("txt(*.txt)", "txt"));
					int result = fc.showOpenDialog(getParent());
					if(result == JFileChooser.APPROVE_OPTION)
					{
						File file = fc.getSelectedFile();																		//获取打开的文件
						msgTextArea.append("打开文件:"+file.getAbsolutePath()+"\n\n");
				        try {
				        	Reader reader = new InputStreamReader(new FileInputStream(file));									//System.out.println("以字符为单位读取文件内容，一次读一个字节：");
				        	int tempchar;																						// 一次读一个字符
				            while ((tempchar = reader.read()) != -1) {
				                if (((char) tempchar) != '\r') {																//对于windows下，\r\n这两个字符在一起时，表示一个换行。
				                    System.out.print((char) tempchar);															//但如果这两个字符分开显示时，会换两次行。因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。
				                    msgTextArea.append((tempchar)+"");															//String str = ""+tempchar;
				                }
				            }
				            reader.close();
				        } catch (Exception e1) {
				            e1.printStackTrace();
				        }
				        try {
							Desktop.getDesktop().open(file);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			});
		}
		return readButton;
	}
	
	public Lab11_4() {
		super();
		initialize();
	}
	
	private void initialize() {
		this.setContentPane(getContentPane());
		this.setTitle("JFrame");
		this.setBounds(200, 200, 400, 300);
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
		Lab11_4 thisClass = new Lab11_4();
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisClass.setVisible(true);
	}

}
