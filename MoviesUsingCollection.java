import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;


class Movies implements Comparable<Movies>{
	String Name;
	int year;
	int cost;
	Movies(String Name,int year,int cost){
		this.Name=Name;
		this.year=year;
		this.cost=cost;
	}
	public String getmovie() {
		return Name+" , "+year+" , "+cost;
	}
	@Override
	public int compareTo(Movies o) {
		// TODO Auto-generated method stub
		return o.year-this.year;
	}
	
}
class Sortbycost implements Comparator<Movies>{

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return o1.cost-o2.cost;
	}
	
}
public class MoviesUsingCollection {

	public static void main(String[] args) {
		Movies m1=new Movies("Avengers",2012,4);
		Movies m2=new Movies("Game of thrones",2013,5);
		Movies m3=new Movies("Avatar",2008,3);
		List<Movies> movie=new ArrayList<Movies>();
		movie.add(m1);
		movie.add(m2);
		movie.add(m3);
		Collections.sort(movie,new Sortbycost());
		ListIterator<Movies> itm=movie.listIterator();
		while(itm.hasNext()) {
			System.out.println(itm.next().getmovie());
		}
		

	}

}
