package Lab10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Alist = new ArrayList<String>();														//创建ArrayList
		List<String> Llist = new LinkedList<String>();														//创建LinkedList
		Iterator<String> Aiterator = Alist.iterator();														//创建ArrayList迭代器
		Iterator<String> Literator = Llist.iterator();														//创建LinkedList迭代器
		
		long AAddstartTime = System.currentTimeMillis();													//记录ArrayList插入前时刻
		for (int i = 0; i < 200000; i++) {
			Alist.add("A");																					//ArrayList插入20w个数据
		}
		long AAddendTime = System.currentTimeMillis();														//记录ArrayList插入后时刻
		
		long ARemovestartTime = System.currentTimeMillis();													//记录ArrayList删除前时刻
		while (Aiterator.hasNext()) {	
			Alist.remove(0);																				//ArrayList删除20w个数据
		}
		long ARemoveendTime = System.currentTimeMillis();													//记录ArrayList删除后时刻
		
		long LAddstartTime = System.currentTimeMillis();													//记录LinkedList插入前时刻
		for (int i = 0; i < 200000; i++) {	
			Llist.add("A");																					//LinkedList插入20w个数据
		}
		long LAddendTime = System.currentTimeMillis();														//记录LinkedList插入后时刻
		
		long LRemovestartTime = System.currentTimeMillis();													//记录LinkedList删除前时刻
		while (Literator.hasNext()) {
			Llist.remove(0);																				//LinkedList删除20w个数据
		}
		long LRemoveendTime = System.currentTimeMillis();													//记录LinkedList删除后时刻
		
		System.out.println("ArrayList插入20w个的时长为："+(AAddendTime-AAddstartTime));							//计算ArrayList插入时长
		System.out.println("ArrayList删除20w个的时长为："+(ARemoveendTime-ARemovestartTime));						//计算ArrayList删除时长
		System.out.println("LrrayList插入20w个的时长为："+(LAddendTime-LAddstartTime));							//计算LinkedList插入时长
		System.out.println("LrrayList删除20w个的时长为："+(LRemoveendTime-LRemovestartTime));						//计算LinkedList删除时长
	}

}
