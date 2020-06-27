import java.util.Scanner;

public class EvenIndexPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int n = s.nextInt();
		
		int ar[]=new int[n];
		
		System.out.println("Enter the elements of the Array :");
		for(int i=0; i<ar.length;i++) {
			ar[i] = s.nextInt();
		}
		System.out.println();
		System.out.println("Array Elements at Even Index :");
		for(int i=0; i<ar.length;i++) {
			if(i%2==0) {
				System.out.print(ar[i]+" ");
			}
		}
	}

}
