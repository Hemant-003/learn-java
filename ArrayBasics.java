import java.util.*;
class ArrayBasics{
	public static void main(String[] args) {
		int uy;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int length = sc.nextInt();
		int x[] = new int[length];
		for (int i=0; i<x.length;i++){
			x[i]=sc.nextInt();
		}
		for (int j=0;j<x.length;j++) {
			System.out.println(x[j]);
		}

		System.out.println(x.length);
	}
}