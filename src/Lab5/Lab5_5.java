package Lab5;
import java.util.*;
import java.lang.Math;
interface Type{
	void Area();
	void Circumference();
}

class Circle implements Type{
	Circle(){
		radius = 0;
		System.out.println("创建了一个圆！");
	}
	final double P = 3.14;
	public double radius;
	public void Area(){
		System.out.println("圆的面积是："+P*radius*radius);
	}
	public void Circumference(){
		System.out.println("圆的周长是："+P*radius*2);
	}
	public void set_radius(double radius){
		this.radius = radius;
	}
}

class Triangle implements Type{
	Triangle(){
		a = 0;
		b = 0;
		c = 0;
		System.out.println("创建了一个三角形！");
	}
	public double a;
	public double b;
	public double c;
	public void Area(){
		double p = (a+b+c)/2;
		System.out.println("三角形的面积是："+Math.sqrt(p*(p-a)*(p-b)*(p-c)));
	}
	public void Circumference(){
		System.out.println("三角形的周长是："+(a+b+c));
	}
}

class Rectangl implements Type{
	Rectangl(){
		length = 0;
		width = 0;
		System.out.println("创建了一个矩形！");
	}
	public double length;
	public double width;
	public void Area(){
		System.out.println("矩形的面积是："+length*width);
	}
	public void Circumference(){
		System.out.println("矩形的周长是："+(length*2+width*2));
	}
}

public class Lab5_5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner cin = new Scanner(System.in);
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Rectangl rectangl = new Rectangl();
		String numString = "[1-9]\\d*[.]*\\d*";
		Double sum = 0.0;
		
		System.out.println();
		System.out.print("请输入圆的半径：");
		while(true){
			String aString = cin.next();
			if (aString.matches(numString)) {
				sum = Double.parseDouble(aString);
				break;
			}
			else {
				System.err.println("请重新输入！");
			}
		}
		circle.radius = sum;
		
		System.out.print("请输入三角形的三条边：");
		while(true){
			String aString = cin.next();
			if (aString.matches(numString)) {
				sum = Double.parseDouble(aString);
				break;
			}
			else {
				System.err.println("请重新输入！");
			}
		}
		triangle.a = sum;
		while(true){
			String aString = cin.next();
			if (aString.matches(numString)) {
				sum = Double.parseDouble(aString);
				break;
			}
			else {
				System.err.println("请重新输入！");
			}
		}
		triangle.b = sum;
		while(true){
			String aString = cin.next();
			if (aString.matches(numString)) {
				sum = Double.parseDouble(aString);
				break;
			}
			else {
				System.err.println("请重新输入！");
			}
		}
		triangle.c = sum;
		
		System.out.print("请输入矩形的长和宽：");
		while(true){
			String aString = cin.next();
			if (aString.matches(numString)) {
				sum = Double.parseDouble(aString);
				break;
			}
			else {
				System.err.println("请重新输入！");
			}
		}
		rectangl.length = sum;
		while(true){
			String aString = cin.next();
			if (aString.matches(numString)) {
				sum = Double.parseDouble(aString);
				break;
			}
			else {
				System.err.println("请重新输入！");
			}
		}
		rectangl.width = sum;
		
		circle.Area();
		circle.Circumference();
		triangle.Area();
		triangle.Circumference();
		rectangl.Area();
		rectangl.Circumference();
		
		cin.close();
	}

}
