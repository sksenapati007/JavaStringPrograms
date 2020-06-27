import java.util.*;

public class ProductEvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the size of the Array :");
				int n = s.nextInt();
				
				int ar[]=new int[n];
				GetValue9 gv9 = new GetValue9();
				gv9.productEvenIndex(ar);
			}
		}

		class GetValue9{
			void productEvenIndex(int a[]) {
				long prod=1;
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the elements of the Array :");
				for(int i=0; i<a.length;i++) {
					a[i] = s.nextInt();
					if(i%2==0) {
						prod = prod * a[i];
					}
					
				}
				System.out.println();
				System.out.println("Product of Even Indexed positions in the Array :");
				System.out.println(prod);
			}
		}
