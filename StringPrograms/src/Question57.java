import java.util.Scanner;

public class Question57 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		System.out.println("Converting the String to Lowercase : "+str.toLowerCase());
	}

}