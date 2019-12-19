package Lab14;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import javax.swing.*;
public class improve extends JFrame{
	static Connection con;
	static PreparedStatement sql;
	static ResultSet res;
	public Connection getConnection(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/stu_info?useSSL=false&serverTimezone=UTC","root","123456");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	private static final long serialVersionUID = 1L;
	private JPanel jContentPanel = null;
	private JTextArea jTextArea = null;
	private JPanel controlPanel = null;
	private JButton checkButton = null;
	private JButton changeButton = null;
	private void initialize() {
		this.setContentPane(getContentPane());
		this.setTitle("stu数据库");
		this.setBounds(200, 200, 400, 300);
		this.add(getJContentPane());
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
	private JPanel getControlPanel() {
		if (controlPanel == null) {
			controlPanel = new JPanel();
		}
		controlPanel.add(getcheckButton());
		return controlPanel;
	}
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
		}
		return jTextArea;
	}
	private JButton getcheckButton() {
		if (checkButton == null) {
			checkButton = new JButton();
			checkButton.setText("查看数据库");
			checkButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						sql = con.prepareStatement("select*from stu_info");
						res = sql.executeQuery();
						jTextArea.setText("");
						while (res.next()) {
							String id=res.getString("stu_ID");
							String name=res.getString("stu_Name");
							String sex=res.getString("stu_Sex");
							jTextArea.append(id+" "+name+" "+sex+"\r\n");
						}
						System.out.println();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});
		}
		return checkButton;
	}
	public improve(){
		super();
		initialize();
	}
	public static void main(String[] args) {
		improve c = new improve();
		con = c.getConnection();
	}

}
