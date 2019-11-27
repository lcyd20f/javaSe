package Lab2;
import java.util.Scanner;
class member{
	
	private String usename;
	private String name;
	private String code;
	private float money;
	
	member(){
		usename="default";
		name="default";
		code="default";
		money=0;
	}
	member(String usename,String name,String code,float money){
		this.usename=usename;
		this.name=name;
		this.code=code;
		this.money=money;
	}
	
	public void set_usename(String usename){//修改用户名
		this.usename=usename;
	}
	public void set_name(String name){//修改姓名
		this.name=name;
	}
	public void set_code(){//修改密码
		System.out.println("请输入旧密码：");
		Scanner input1=new Scanner(System.in);
		String code=input1.next();
		
		if(code.equals(this.code)){
			System.out.println("请输入新密码：");
			Scanner input2=new Scanner(System.in);
			this.code=input2.next();
			System.out.println("修改成功！");
		}
		else
			System.err.println("密码错误");
	}
	public void check_money(){
		System.out.println("当前余额为："+this.money);
	}
	
	public void add_money(float money){//存款
		this.money+=money;
		System.out.println("当前余额为:"+this.money);
	}
	public void sub_money(float money){//取款
		if(this.money-money<0)
			System.out.println("没有那么多钱！");
		else {
			this.money-=money;
			System.out.println("当前余额为:"+this.money);
		}
	}
}
public class Lab2_4 {
	public static void main(String[] args) {
		//要求能够存放用户的账号、姓名、密码和账户余额等个人信息
		//并包含存款、取款、查询余额和修改账户密码等操作
		//并用此类创建对象，对象的账号为100，姓名为Tom，密码为11111，账户余额为10000
		member people=new member("100","Tom","111111",10000);
		System.out.println("当前账号为:100");
		System.out.println("当前姓名为:Tom");
		System.out.println("当前密码为：******");
		System.out.println("当前余额为:10000");
		boolean bool=true;
		while(bool){
			System.out.println("存款请输入：add");
			System.out.println("取款请输入：sub");
			System.out.println("查询余额请输入：check_money");
			System.out.println("修改账户密码请输入：set_code");
			Scanner input=new Scanner(System.in);
			String order=input.next();
			if(order.equals("add")){
				System.out.println("请输入你要存入的存款：");
				input=new Scanner(System.in);
				Float x=input.nextFloat();
				people.add_money(x);
				System.out.println();
			}
			else if(order.equals("sub")){
				System.out.println("请输入你要取出的存款：");
				input=new Scanner(System.in);
				Float x=input.nextFloat();
				people.sub_money(x);
				System.out.println();
			}
			else if(order.equals("check_money")) {
				people.check_money();
				System.out.println();
			}
			else if(order.equals("set_code")){
				people.set_code();
				System.out.println();
			}
			else {
				System.out.println("请重新输入指令！");
				System.out.println();
			}
		}
	}

}
