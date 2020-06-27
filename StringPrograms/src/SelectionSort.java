import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);		
		System.out.println("Enter the size of the Array :");
		int n = s.nextInt();
		
		int ar[]=new int[n];
		Sort s1 = new Sort();
		s1.selectionSort(ar);
		
	}
}

class Sort{
		
	void selectionSort(int a[]) {
		int temp;
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the elements of the Array :");
		for(int i=0; i<a.length;i++) {
			a[i] = s2.nextInt();
		}
		
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
		
	}
}
