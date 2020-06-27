import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int n = s.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the elements of the Array :");
		for(int i=0; i<a.length;i++) {
			a[i] = s.nextInt();
		}
		System.out.println();
		System.out.println("Array Elements in Reverse Order :");
		for(int i=(a.length-1); i>=0; i--) {
			System.out.print(a[i]+" ");
		}
	}

}
