package Lab15;
import java.awt.*;
import javax.swing.*;
public class Lab15_1 extends JFrame{
	private final int width_sun = 40;
	private final int height_sun = 40;
	private final int width_plant = 160;
	private final int height_plant = 120;
	public Lab15_1() {
		super();
		initislize();
	}
	private void initislize() {
		this.setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new DrawPanel());
	}
	class DrawPanel extends JPanel{
		public void paint(Graphics g) {
			super.paint(g);
			g.drawOval(120, 60, width_sun, height_sun);
			g.drawOval(70, 20, width_plant, height_plant);
			g.drawString("SUN", 128, 85);
			g.setFont(new Font("Ëæ±ã", Font.PLAIN, 15));
			g.setColor(Color.BLUE);
			g.drawString("¡ï", 85, 45);
		}
	}
	public static void main(String[] args) {
		new Lab15_1().setVisible(true);
	}

}
