package august;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book{
	String title;
	String authr;
	double price;
	int qunty;
	int sold;
	Book(String title,String authr,double price,int qunty){
		this.title=title;
		this.authr=authr;
		this.price=price;
		this.qunty=qunty;
		sold=0;
	}
	public String getname() {
		return title;
	}
	public String getauthur() {
		return authr;
	}
	public double getprice() {
		return price;
	}
	public void setsold(int q) {
		this.sold=sold+q;
		this.qunty=qunty-sold;
	}
	
}
public class BookInventoryUsingArrayList {

	public static void main(String[] args) {
		List<Book> book=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.Add book\n2.Sell book\n3.search book\n4.Exit"); 
			System.out.println("Enter option");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Enter Book name:");
				String bname=sc.next();
				System.out.println("Enter authur:");
				String authur=sc.next();
				System.out.println("Enter price:");
				double price=sc.nextDouble();
				System.out.println("Enter quantity:");
				int qty=sc.nextInt();
				Book b=new Book(bname,authur,price,qty);
				book.add(b);
				break;
			case 2:
				System.out.println("Enter book name: ");
				String name=sc.next();
				for(Book bk:book) {
					if(bk.getname().equalsIgnoreCase(name)) {
						System.out.println("Enter quantity:");
						int qunty=sc.nextInt();
						bk.setsold(qunty);
					}
				}
				System.out.println("Book sold");
				break;
			case 3:
				System.out.println("Enter authur name:");
				String aname=sc.next();
				for(Book bk:book) {
					if(bk.getauthur().equalsIgnoreCase(aname)) {
						System.out.println(bk.getname()+" "+bk.getauthur()+" "+bk.getprice());
					}
				}
				break;
			case 4:
				System.exit(0);
				break;
			}
		}


	}

}
