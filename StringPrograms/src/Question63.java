import java.util.Scanner;

public class Question63 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		ABCSpaces cspc = new ABCSpaces(); 
		cspc.getABCSpaces(str);
		
	}

}

class ABCSpaces{
	
	void getABCSpaces(String x) {
					x=x.replace(" ", "ABC");
		System.out.println("ABC instead of Spaces in this string: "+x);
	}
}