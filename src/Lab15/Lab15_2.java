package Lab15;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class Lab15_2 extends JFrame{
	private Image img = null;
	private MyCanvas canvasPanel = null;
	private int r = 0;
	public Lab15_2() {
		initialize();
	}
	private void initialize() {
		canvasPanel = new MyCanvas();
		JPanel jp = new JPanel();
		setBounds(200, 200, 400, 400);
		add(canvasPanel);
		canvasPanel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {
				r += 90;
				canvasPanel.repaint();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Photo");
		this.setVisible(true);
	}
	
	class MyCanvas extends JPanel{
		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D)g;
			URL url = Lab15_2.class.getResource("/img/4.jpg");
			img = Toolkit.getDefaultToolkit().getImage(url);
			g2.rotate(Math.toRadians(r), 200, 200);
			g2.drawImage(img, 0, 0, 400, 400, this);
		}
	}
	
	public static void main(String[] args) {
		new Lab15_2();
	}

}