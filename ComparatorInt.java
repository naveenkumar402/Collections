package august28;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Demo1{
	String name;
	int age;
	Demo1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name.toString()+" "+age;
	}
}
class Sortbyage implements Comparator<Demo1>{

	@Override
	public int compare(Demo1 o1, Demo1 o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}
	
}
public class ComparatorInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Demo1> l=new PriorityQueue<>(new Sortbyage());
		Demo1 d=new Demo1("Steve",22);
		Demo1 d1=new Demo1("Steve",21);
		Demo1 d2=new Demo1("Steve",20);
		Demo1 d3=new Demo1("Steve",19);
		l.add(d);
		l.add(d1);
		l.add(d2);
		l.add(d3);
		System.out.println(l.toString());

	}

}
