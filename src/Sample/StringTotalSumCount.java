package Sample;

public class StringTotalSumCount {

	public static void main(String[] args) {
	
		 String s = "1234asdfg90876qwerdfy&#$ioy78";
	        
	        // Regex to match sequences of digits
	        String regex = "\\d+";
	        
	        // Use a Pattern and Matcher to find all sequences of digits
	        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
	        java.util.regex.Matcher matcher = pattern.matcher(s);
	        
	        int totalSum = 0;
	        
	        // Iterate over all found sequences and add their integer values to the sum
	        while (matcher.find()) {
	            String numberStr = matcher.group();
	            int number = Integer.parseInt(numberStr);
	            totalSum += number;
	            System.out.println("Found number: " + number);
	        }
	        
	        System.out.println("Total Sum: " + totalSum);
	    }


	}


