package Lab3;
import java.util.Scanner;
public class Lab3_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	
	//构造
		//字符数组赋值
		char[] a1 = {'a','b','c','d','e','f','g'};
		String str2=new String(a1);
		
		//字符数组先获取数组位置再获取长度
		char[] a2 = {'a','b','c','d','e','f','g'};
		str2=new String(a2,2,4);
		
		//直接String赋值
		String str1 = "abcdefg";
		
		//引用赋值
		str2 = "abcdefg";
		
		System.out.println("现有字符串str1为abcdefg");
		System.out.println("输入新字符串str1：");
		Scanner input_String_new = new Scanner(System.in);
		str1 = input_String_new.next();
		
	//获取长度length
		int length = str1.length();
		System.out.println(str1+"的长度是："+length);
		
	//查找index of
		char index_char;
		int index1;
		Scanner input_char = new Scanner(System.in);
		while(true){
			System.out.println("输入str1中你要搜索的字符：");
			index_char = input_char.next().charAt(0);
			index1 = str1.indexOf(index_char);
			if(index1==-1)
				System.err.println("找不到该字符！");
			else
				break;
		}
		System.out.println(str1+"中"+index_char+"的数组位置是："+index1);
		
		String index_String;
		int index2;
		Scanner input_String = new Scanner(System.in);
		while(true){
			System.out.println("输入str1中你要搜索的字符串：");
			index_String = input_String.next();
			index2 = str1.indexOf(index_String);
			if(index2==-1)
				System.err.println("找不到该字符串！");
			else
				break;
		}
		System.out.println(str1+"中"+index_String+"的数组开始位置是："+index2);
		
	//返回字符charAt
		int index_number;
		Scanner input_number;
		while(true){
			System.out.println("输入str1中你要搜索的数组索引号：");
			input_number = new Scanner(System.in);
			index_number = input_number.nextInt();
			if(index_number>str1.length()-1||index_number<0)
				System.err.println("输入错误!");
			else
				break;
		}
		char mychar = str1.charAt(index_number);
		System.out.println("字符串str1索引位置为"+index_number+"的字符为："+mychar);
		
	//获取子串substring
		int index_sub;
		Scanner input_sub;
		while(true){
			System.out.println("输入str1中索引号获取子串至末尾：");
			input_sub = new Scanner(System.in);
			index_sub = input_sub.nextInt();
			if(index_sub>str1.length()-1||index_sub<0)
				System.err.println("输入错误!");
			else
				break;
		}
		String sub = str1.substring(index_sub);
		System.out.println("字符串str1中从索引号"+index_sub+"获取子串至末尾的字符串为："+sub);
		
		int index_sub1;
		int index_sub2;
		Scanner input_sub1;
		while(true){
			System.out.println("输入str1中索引号获取子串至末尾：");
			input_sub1 = new Scanner(System.in);
			index_sub1 = input_sub1.nextInt();
			index_sub2 = input_sub1.nextInt();
			if(index_sub2>str1.length()-1||index_sub1<0||index_sub1>=index_sub2)
				System.err.println("输入错误!");
			else
				break;
		}
		String sub1 = str1.substring(index_sub1,index_sub2);
		System.out.println("字符串str1中从索引号"+index_sub1+"到"+index_sub2+"获取子串至末尾的字符串为："+sub1);
		
	//去除空格trim
		System.out.println("输入trim来去除字符串str1中的空格：");
		Scanner trim_String = new Scanner(System.in);
		String trim = "0";
		while(trim != "trim") {
			System.err.println("输入错误!");
			trim = trim_String.next();
		}
		System.out.println("去除空格后的字符串str1为"+str1.trim());
		System.out.println("去除空格后的字符串str1长度为"+str1.trim().length());
		
	//替换replace
		System.out.println("输入你要字符串str1中被替换的字符：");
		Scanner String_char = new Scanner(System.in);
		String replace1 = String_char.next();
		System.out.println("输入你要字符串str1中替换的字符：");
		String replace2 = String_char.next();
		while(true) {
			if (str1.indexOf(replace1)==-1)
				System.err.println("找不到该字符串！请重新输入！");
			else
				break;
		}
		System.out.println("替换后的字符串str1为"+str1.replace(replace1,replace2));
		
	//相等equal
		System.out.println("输入新的字符串str2判断与str1是否一致：");
		str2 = input_String.next();
		if(str1.equals(str2))
			System.out.println("str1与str2一致！");
		else
			System.out.println("str1与str2不一致！");
		
	//比较compareTo
		System.out.println("输入新的字符串str2判断与str1哪一个字典序更前：");
		str2 = input_String.next();
		if(str1.compareTo(str2) == 1)
			System.out.println("str2比str1字典序更前！");
		else
			System.out.println("str1比str2字典序更前！");
		
	//分割split
		System.out.println("输入分割字符串str1的分隔符：");
		String array = input_char.next();
		String[] Array = str1.split(array);
		for(String a : Array)
			System.out.print(a+" ");
		System.out.println();
		
		input_String_new.close();
		input_char.close();
		input_String.close();
		input_number.close();
		input_sub.close();
		input_sub1.close();
		trim_String.close();
		String_char.close();
	}
}

