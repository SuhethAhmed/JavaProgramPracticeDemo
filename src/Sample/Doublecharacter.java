package Sample;
import java.util.Scanner;

public class Doublecharacter {

	public static void main(String[] args) {
		 String str = "abcd";
	       String result = "";

	        for (int i = 0; i < str.length(); i++) {
	            result += str.charAt(i);
	            result += str.charAt(i);
	        }
	        System.out.println(str);
	        System.out.println(result);

	}

}
