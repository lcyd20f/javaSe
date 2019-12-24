package Lab15;
import java.awt.*;
import javax.swing.*;
public class Lab15_3 extends JFrame{
	private final int width_circle = 80;
	private final int height_circle = 80;
	public Lab15_3() {
		super();
		initislize();
	}
	private void initislize() {
		this.setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new DrawPanel());
	}
	class DrawPanel extends JPanel{
		public void paint(Graphics g) {
			super.paint(g);
			g.setColor(new Color(240, 248, 255));
			g.fillRect(0, 0, 400, 300);
			g.setColor(Color.BLACK);
			g.drawLine(40, 60, 40, 250);
			g.setColor(Color.WHITE);
			g.fillRoundRect(40, 20, 260, 170, 50, 50);
			g.setColor(Color.BLUE);
			g.drawOval(60, 40, width_circle, height_circle);
			g.setColor(Color.BLACK);
			g.drawOval(130, 40, width_circle, height_circle);
			g.setColor(Color.RED);
			g.drawOval(200, 40, width_circle, height_circle);
			g.setColor(Color.YELLOW);
			g.drawOval(100, 100, width_circle, height_circle);
			g.setColor(Color.GREEN);
			g.drawOval(170, 100, width_circle, height_circle);
			g.setFont(new Font("Ëæ±ã", Font.PLAIN, 20));
			g.setColor(Color.BLACK);
			g.drawString("Olympic", 140, 230);
		}
	}
	public static void main(String[] args) {
		new Lab15_3().setVisible(true);
	}

}
