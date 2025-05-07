package Sample;

public class VowelsRemove {

	public static void main(String[] args) {
		
		
		String s="prepinsta";
		
		//String s1="";
		String s1=s.replaceAll("[aeiou]", "");
		System.out.println(s1);

		
		String str="prepinsta";
		
		String s2="";
		s2=s.replaceAll("[aeiou]", "");
		System.out.println(s2);
	}

}
