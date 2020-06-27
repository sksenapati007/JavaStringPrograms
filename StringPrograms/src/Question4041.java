import java.util.Scanner;

public class Question4041 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();
		CountXSpaces can = new CountXSpaces(); 
		can.getCountXSpaces(str);
	}

}

class CountXSpaces{

	void getCountXSpaces(String x) {

		int xSpaces=0;
		int exSpaces=0;
		for(int j=0;j<x.length();j++) {
			if(x.charAt(j)==' ') {
				xSpaces++;
				int k= j+1;
				if(x.charAt(k)==' ') {
					exSpaces++;
					k++;
				}
			}
		}
		System.out.println("Number  of Spaces   in this string are: "+xSpaces);
		System.out.println("Number of Extra Spaces in this string are: "+exSpaces);
		
	}
}