import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int n = s.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the elements of the Array :");
		for(int i=0; i<a.length;i++) {
			a[i] = s.nextInt();
			sum = sum + a[i];
		}
		System.out.println();
		System.out.println("Sum of Array Elements :");
		System.out.println(sum);
	}

}

