package Lab10;

import java.util.*;

public class Lab10_1{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<String> list = new ArrayList<>();
		char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
					'o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int i = 0; i < a.length; i++){
			list.add(String.valueOf(a[i]));
		}
		System.out.println("输入add开始添加字符");
		System.out.println("输入delete开始删除字符");
		System.out.println("输入quit退出程序");
		Scanner cin = new Scanner(System.in);
		String str = cin.next();
		String s = "";
		while(!str.equals("quit")){
			if(str.equals("add")){
				System.out.println("请输入要添加的字符");
				Boolean flag = false;
				s = cin.next();
				while(s.length()>1){
					System.err.println("输入应为字符！请重新输入！");
					System.out.println("请输入要添加的字符");
					s = cin.next();
				}
				for(String e : list){
					if(e.equals(s)){
						System.out.println("列表中已有此字符");
						flag = true;
					}
				}
				if(!flag){
					list.add(s);
					System.out.println("添加成功");
				}
			}
			else if(str.equals("delete")){
				System.out.println("请输入要删除的字符");
				Boolean flag = false;
				s = cin.next();
				while(s.length()>1){
					System.err.println("输入应为字符！请重新输入！");
					System.out.println("请输入要删除的字符");
					s = cin.next();
				}
				for(int i = 0; i < list.size(); i++){
					if(list.get(i).equals(s)){
						list.remove(i);
						flag = !flag;
						break;
					}
				}
				if(flag){
					System.out.println("移除成功");
				}
				else{
					System.out.println("列表中无此字符，无法删除");
				}
			}
			else if(str.equals("quit")){
				break;
			}
			else{
				System.err.println("输入错误，请重新输入！");
			}
			System.out.println("输入add开始添加字母");
			System.out.println("输入delete开始删除字母");
			System.out.println("输入quit退出程序");
			str = cin.next();
		}
		System.out.println("程序关闭");
		cin.close();
	}

}
