package alphapattern;

public class Alphadiamond {
	public static void main(String[] args) {
		int a = 'A';
		int b = 'F'; 
		for (int i = 1; i <= 5; i++) {
			for (int s = i; s<5; s++) {
				System.out.print(" ");
			}
		
			for (int j = 1; j <= i + (i - 1); j++) {
				System.out.print((char)a +"");
			}
			System.out.println();
			a++;
		}
		
		for (int p = 6; p <= 9; p++) {
			for (int q = 6; q<=p; q++) {
				System.out.print(" ");
			}
		
			for (int r = 1; r <= 19-(2*p); r++) {
				System.out.print((char)b +"");
			}
			System.out.println();
			b++;
		}
		
	}
}
