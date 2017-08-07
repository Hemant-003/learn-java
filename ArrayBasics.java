import java.util.*;

class ArrayBasics{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length of array:");
		
		int len = sc.nextInt();

		int x[] = new int[len];

		for(int i=0; i<x.length;i++){
			
			x[i]=sc.nextInt();

		}
		

		
		System.out.println("Tell me number of elements you want to print:");

		int k = sc.nextInt();
		
		for (int j=0; j<x.length ;j++ ) {

			for (int l=0;l<x[j] ;l++ ) {
				if (x[l]>x[j]){
					System.out.println(x[j]);

				}
				
			}
					}
 }
	}