import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		// Define an array of integers of size N. 
		int[] numArray = new int[N];		
		

		int sum = 0;
		for(int i=0; i<N; i++){
			numArray[i] = s.nextInt(); // Get the input
		}
	    
	    // Write the logic to add these numbers here:
	   for(int j=0;j<N;j++){
	       
	    sum +=numArray[j]*numArray[j];
	   } 
	    
	    
		// Print the sum
		System.out.print(sum);
		s.close();
	}

}