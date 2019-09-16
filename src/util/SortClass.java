package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//按照x从大到小，y从小到大排列
public class SortClass {
	public int x;
	public int y;
	public SortClass(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public static void main(String[] args){
		SortClass s1=new SortClass(1,10);
		SortClass s2=new SortClass(2,9);
		SortClass s3=new SortClass(3,7);
		SortClass s4=new SortClass(3,8);
		SortClass s5=new SortClass(4,6);
		List<SortClass> l=new ArrayList<SortClass>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		//需要降序时使用reversed
		l.sort(Comparator.comparing(SortClass::getX).reversed().thenComparing(SortClass::getY));
		//使用lamda表达式输出
		l.forEach(it->System.out.println(it.x+","+it.y));
	}
	
}
