package august28;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfStringUsingHashMap {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		freq();

	}
	static void freq() {
		String s=sc.nextLine();
		String [] a=s.split(" ");
		Map<String,Integer>m=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			int count=0;
			if(m.containsKey(a[i])) {
				int val=m.get(a[i]);
				m.replace(a[i],val,val+1);
			}
			else m.put(a[i],count+1);
		}
		System.out.println(m);
	}

}
