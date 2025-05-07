 package Sample;

public class commonoccurance1 {

	public static void main(String[] args) {
		
		 int[] arr = {1,2,2,3,3,3,4,5,6,6,7,7,8,8,8,8,8};
	       
		 boolean[] visited = new boolean[arr.length];

	        for (int i = 0; i < arr.length; i++) 
	        {
	            if (!visited[i]) 
	            {
	                int count = 1;

	         for (int j = i + 1; j < arr.length; j++) 
	         {
	             if (arr[i] == arr[j])
	             {
	                  visited[j] = true;
	                  count++;
	             }
	         }

	                if (count > 1) {
	                    System.out.println(arr[i] + " -> " + count);
	                }
	            }
	        }
	    }


	}


