package Lab9;
import javax.swing.*;
import javax.xml.stream.events.StartDocument;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

class Chart {
	public static int a = 0;
	public static int b = 0;
	public static int c = 0;
	public static int d = 0;
	public static int e = 0;
	static ChartPanel frame;
	public Chart(){
		CategoryDataset dataset = getDataSet();
        JFreeChart chart = ChartFactory.createBarChart3D(
       		                "投票", // 图表标题
                            "成员", // 目录轴的显示标签
                            "票数", // 数值轴的显示标签
                            dataset, // 数据集
                            PlotOrientation.HORIZONTAL, // 图表方向：水平、垂直
                            true,           // 是否显示图例(对于简单的柱状图必须是false)
                            false,          // 是否生成工具
                            false           // 是否生成URL链接
                            );
        
        //从这里开始
        CategoryPlot plot=chart.getCategoryPlot();//获取图表区域对象
        CategoryAxis domainAxis=plot.getDomainAxis();         //水平底部列表
         domainAxis.setLabelFont(new Font("黑体",Font.BOLD,14));         //水平底部标题
         domainAxis.setTickLabelFont(new Font("宋体",Font.BOLD,12));  //垂直标题
         ValueAxis rangeAxis=plot.getRangeAxis();//获取柱状
         rangeAxis.setLabelFont(new Font("黑体",Font.BOLD,15));
          chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 15));
          chart.getTitle().setFont(new Font("宋体",Font.BOLD,20));//设置标题字体
          
          //到这里结束，虽然代码有点多，但只为一个目的，解决汉字乱码问题
          
         frame=new ChartPanel(chart,true);        //这里也可以用chartFrame,可以直接生成一个独立的Frame
         
	}
		static CategoryDataset getDataSet() {
           DefaultCategoryDataset dataset = new DefaultCategoryDataset();
           dataset.addValue(a, "A", "A");
           dataset.addValue(b, "B", "B");
           dataset.addValue(c, "C", "C");
           dataset.addValue(d, "D", "D");
           dataset.addValue(e, "E", "E");
           return dataset;
	   }

		public static ChartPanel getChartPanel(){
			return frame;
		}
}

class start extends JFrame{
	public start() {
		final JFrame frame=new JFrame("Java数据统计图");
		new Chart();
		frame.add(Chart.getChartPanel());
		
		JPanel jp = new JPanel(new GridLayout(5, 1, 5, 5));
		
		//五个按钮
		JButton jb1 = new JButton("A");
		JButton jb2 = new JButton("B");
		JButton jb3 = new JButton("C");
		JButton jb4 = new JButton("D");
		JButton jb5 = new JButton("E");
		
		//按钮作用
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chart.a++;
				new start();
				frame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING));
			}
		});
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chart.b++;
				new start();
				frame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING));
			}
		});
		jb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chart.c++;
				new start();
				frame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING));
			}
		});
		jb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chart.d++;
				new start();
				frame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING));
			}
		});
		jb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chart.e++;
				new start();
				frame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING));
			}
		});
		
		//按钮添加
		jp.add(jb1);jp.add(jb2);jp.add(jb3);jp.add(jb4);jp.add(jb5);
		frame.add(BorderLayout.WEST,jp);
		
		
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds((int)(screensize.getWidth()/2-400),(int)(screensize.getHeight()/2-300), 800, 600);
		frame.setResizable(false);
		frame.setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}

public class Lab9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new start();
	}

}
