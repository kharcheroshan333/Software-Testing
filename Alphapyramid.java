package alphapattern;

public class Alphapyramid {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			
				for (int s = 5; s > i; s--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i + (i - 1); j++) {
                 if(i%2==0) {
					System.out.print("#");

					}else {
						System.out.print('A');
					}
			
			}
				System.out.println();
			}
			
		}
}
	

