package august;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Employees1 implements Comparable<Employees1> {
	String name;
	int salary;
	Employees1(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	public String getemployee() {
		return "Name: "+name+" , Salary: "+salary;
	}
	@Override
	public int compareTo(Employees1 o) {
		// TODO Auto-generated method stub
		return o.salary-this.salary;
	}
	
}
public class ComparableInterface {

	public static void main(String[] args) {
		Employees1 e1=new Employees1("John",20000);
		Employees1 e2=new Employees1("Jamie",10000);
		Employees1 e3=new Employees1("Rob",35000);
		Employees1 e4=new Employees1("Rob",30000);
		List<Employees1> q=new ArrayList<>();
		q.add(e1);
		q.add(e2);
		q.add(e3);
		q.add(e4);
		Collections.sort(q);
		System.out.println("Highest Salary: "+q.get(0).getemployee());
		System.out.println("\nLowest Salary: "+q.get(q.size()-1).getemployee());
		System.out.println("\nSalary range between 20000 to 40000: \n");
		for(Employees1 e:q) {
			if(e.salary>=20000 && e.salary<=40000)
				System.out.println(e.getemployee());
		}
	}

}
