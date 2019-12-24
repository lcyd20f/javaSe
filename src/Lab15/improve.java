package Lab15;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.*;
import java.util.*;
import javax.swing.*;

import Lab15.Lab15_3.DrawPanel;

public class improve extends JFrame{
	private static Random random = new Random();
    private final static int WIDTH = 300;
    private final static int HEIGHT = 60;
    private final static int CODE = 4;
    private final static int FONT_SIZE = WIDTH / 6;
    private final static char[] CODE_Arr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
    private final static int DISTURB_LINE = 20;
    DrawPanel d = new DrawPanel();
    
    //设置背景字体什么的
    public Graphics initGraphics(Graphics g) {
    	g.setColor(Color.white);
    	g.fillRect(0, 0, WIDTH, HEIGHT);
    	Font f = new Font("随便", Font.BOLD, FONT_SIZE);
    	g.setFont(f);
    	g.setColor(Color.black);
    	g.drawRect(0, 0, WIDTH-1, HEIGHT-1);
    	return g;
    }
    
    //绘制文本
    private char[] drawString(Graphics g) {
    	char[] code = new char[CODE];
    	for (int i = 0; i < CODE; i++) {
    		double r = 10*random.nextDouble()-5;
			g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
			code[i] = CODE_Arr[random.nextInt(CODE_Arr.length)];
			((Graphics2D) g).rotate(Math.toRadians(r), (i*WIDTH)/CODE+WIDTH/(CODE*2), HEIGHT/2);
			g.drawChars(code, i, 1, i*(WIDTH/CODE), FONT_SIZE - random.nextInt(HEIGHT - FONT_SIZE));
		}
		return code;
    }
    
    //绘制干扰线条
    private void drawDisturbLines(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        for (int i = 0; i < DISTURB_LINE; i++) {
            graphics2D.setStroke(new BasicStroke(random.nextFloat() * 2));
            graphics2D.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            graphics2D.drawLine(random.nextInt(WIDTH), random.nextInt(HEIGHT),
                    random.nextInt(WIDTH * 2), random.nextInt(HEIGHT * 2));
        }
    }
    
    //给爷画
    class DrawPanel extends JPanel{
		public void paint(Graphics g) {
			super.paint(g);
			initGraphics(g);
			drawString(g);
			drawDisturbLines(g);
		}
	}
    
    //构造函数
    public improve() {
    	this.setSize(WIDTH, 99);
    	this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(d);
		this.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {	}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {
				d.repaint();
			}
		});
	}
    
	public static void main(String[] args) {
		new improve();
	}

}
