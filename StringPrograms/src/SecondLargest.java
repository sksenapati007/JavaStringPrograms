import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);		
		System.out.println("Enter the size of the Array :");
		int n = s.nextInt();

		int ar[]=new int[n];
		SLargest sl1 = new SLargest();
		sl1.findSecondLarge(ar);

	}
}

class SLargest{

	void findSecondLarge(int a[]) {
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the elements of the Array :");
		for(int i=0; i<a.length;i++) {
			a[i] = s2.nextInt();
		}
		int temp;
		int count=0;
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				if(a[j]==a[0]) {
					count++;
				}
			}
		}
		System.out.println("Array Elements :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("First Largest "+a[0]);
		System.out.println("Second Largest "+a[count]);


	}
}