package alphapattern;

import java.util.Scanner;
public class Alphacoder {
	




	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
	     String s = "CODER";
		//String s=sc.nextLine();
		int l=s.length();
		//System.out.println(l);
		for (int i = 0; i < l; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(s.charAt(j));
				//System.out.print((char)s+"");
			}
			System.out.println();
		}*/
		
		Scanner sc =new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int l = s.length();
		
		for(int i = 0; i<l; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}
}





