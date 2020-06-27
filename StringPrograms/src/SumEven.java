import java.util.Scanner;

public class SumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int n = s.nextInt();
		
		int ar[]=new int[n];
		GetValue2 gv3 = new GetValue2();
		gv3.sumEven(ar);
	}
}

class GetValue2{
	void sumEven(int a[]) {
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements of the Array :");
		for(int i=0; i<a.length;i++) {
			a[i] = s.nextInt();
			if(a[i]%2==0) {
				sum = sum + a[i];
			}
			
		}
		System.out.println();
		System.out.println("Sum of Even numbers in the Array :");
		System.out.println(sum);
	}
}

