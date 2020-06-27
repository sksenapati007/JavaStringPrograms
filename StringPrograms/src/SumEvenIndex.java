import java.util.Scanner;

public class SumEvenIndex {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the size of the Array :");
			int n = s.nextInt();
			
			int ar[]=new int[n];
			GetValue4 gv4 = new GetValue4();
			gv4.sumEvenIndex(ar);
		}
	}

	class GetValue4{
		void sumEvenIndex(int a[]) {
			int sum=0;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the elements of the Array :");
			for(int i=0; i<a.length;i++) {
				a[i] = s.nextInt();
				if(i%2==0) {
					sum = sum + a[i];
				}
				
			}
			System.out.println();
			System.out.println("Sum of Even Indexed postions in the Array :");
			System.out.println(sum);
		}
	}
