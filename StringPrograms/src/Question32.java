import java.util.Scanner;

public class Question32 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		CountConso ccons = new CountConso(); 
		int num=ccons.getCountConso(str.toLowerCase());
		
		System.out.println("Number of Consonants in this string are: "+num);
		
	}

}

class CountConso{
	
	int getCountConso(String x) {
		
		int count=0;
		for(int j=0;j<x.length();j++) {
				if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u') {
					;
				}
				else if(x.charAt(j)==' ') {
					;
				}
				else {
					count++;
				}
		}
		return count;
	}
}