import java.util.*;

public class AverageNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the size of the Array :");
				int n = s.nextInt();
				
				int ar[]=new int[n];
				GetValue10 gv10 = new GetValue10();
				gv10.averageValue(ar);
			}
		}

		class GetValue10{
			void averageValue(int a[]) {
				int sum=0,avg=0;
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the elements of the Array :");
				for(int i=0; i<a.length;i++) {
					a[i] = s.nextInt();
					sum = sum + a[i];
				}
				avg = sum/(a.length);
				System.out.println();
				System.out.println("Average of the values in the Array :");
				System.out.println(avg);
			}
		}
