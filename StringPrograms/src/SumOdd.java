import java.util.Scanner;

public class SumOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int n = s.nextInt();
		
		int ar[]=new int[n];
		GetValue3 gv4 = new GetValue3();
		gv4.sumOdd(ar);
	}
}

class GetValue3{
	void sumOdd(int a[]) {
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements of the Array :");
		for(int i=0; i<a.length;i++) {
			a[i] = s.nextInt();
			if(a[i]%2!=0) {
				sum = sum + a[i];
			}
			
		}
		System.out.println();
		System.out.println("Sum of Odd numbers in the Array :");
		System.out.println(sum);
	}
}

