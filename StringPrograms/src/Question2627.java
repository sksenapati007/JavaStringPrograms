import java.util.Scanner;

public class Question2627 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		CountSpaces cspc = new CountSpaces(); 
		int num=cspc.getCountSpaces(str);
		
		System.out.println("Number of Spaces in this string are: "+num);
		
	}

}

class CountSpaces{
	
	int getCountSpaces(String x) {
		
		int count=0;
		for(int j=0;j<x.length();j++) {
				if(x.charAt(j)==' ') {
					count++;
				}
		}
		return count;
	}
}