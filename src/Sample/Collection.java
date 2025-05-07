package Sample;
import java.util.*;
public class Collection {

	public static void main(String[] args) {
		
		ArrayList<String> ar=new ArrayList<String>();
		
		ar.add("20");
		ar.add("10");
		
		
		Iterator<String>it=ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
