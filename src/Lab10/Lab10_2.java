package Lab10;
import java.util.*;

public class Lab10_2 implements Comparable<Object>{
	String name;
	long id;
	
	public Lab10_2(String name, long id){
		this.name = name;
		this.id = id;
	}
	
	public int compareTo(Object o){
		Lab10_2 upstu = (Lab10_2)o;
		int result = id > upstu.id?1:(id == upstu.id?0:-1);
		return result;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public long getId(){
		return id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public static void main(String[] args) {
		Lab10_2 stu1 = new Lab10_2("李同学",1011);
		Lab10_2 stu2 = new Lab10_2("陈同学",1021);
		Lab10_2 stu3 = new Lab10_2("王同学",1051);
		Lab10_2 stu4 = new Lab10_2("马同学",1012);
		TreeSet<Lab10_2> tree = new TreeSet<>();
		tree.add(stu1);
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		Iterator<Lab10_2> it = tree.iterator();
		System.out.println("Set集合内的所有元素：");
		while(it.hasNext()){
			Lab10_2 stu = (Lab10_2)it.next();
			System.out.println(stu.getId()+" "+stu.getName());
		}
		
	}

}
