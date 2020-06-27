import java.util.Scanner;

public class ProductEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the size of the Array :");
				int n = s.nextInt();
				
				int ar[]=new int[n];
				GetValue6 gv5 = new GetValue6();
				gv5.productEven(ar);
			}
		}

		class GetValue6{
			void productEven(int a[]) {
				long prod=1;
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the elements of the Array :");
				for(int i=0; i<a.length;i++) {
					a[i] = s.nextInt();
					if(a[i]%2==0) {
						prod = prod * a[i];
					}
					
				}
				System.out.println();
				System.out.println("Product of Even numbers in the Array :");
				System.out.println(prod);
			}
		}
