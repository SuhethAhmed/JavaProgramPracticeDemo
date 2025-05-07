package Sample;

import java.util.ArrayList;

public class RemoveDuplicateElementArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar=new ArrayList<>();
		ar.add("suheth");
		ar.add("suheth");
		ar.add("suvaid");
		ar.add("uvais");
		
		ArrayList<String> ar1=new ArrayList<>();
		
		for(int i=0;i<ar.size();i++)
		{
			if(!ar1.contains(ar.get(i)))
			{
				ar1.add(ar.get(i));
			}
		}
		
		System.out.println(ar1);
		
		
		
		
	}

}
