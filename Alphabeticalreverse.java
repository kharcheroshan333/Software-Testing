package alphapattern;

public class Alphabeticalreverse {
	public static void main(String[] args) {
	  /*   char a='E';
	      for( int i=1; i<=5; i++) {
	    	  
	    	  for(int s=1; s<i; s++) {
	    		  System.out.print(" ");
	    		  
	    	  }
	    	  int b= a-(i-1);
	    	  for(int j=5-(i-1); j>=1; j--) {
	    		  System.out.print((char)b+"");
	    		  b--;
	    	  }
	    	  System.out.println();
	    	 
	      }*/
	      
		
		char al = 'E';
		
		for(int i=0; i<5; i++) {
			
			for(int s=0; s<i ; s++) {
				System.out.print(" ");
			}
			  
			int q = al-i;
			for(int j=5 ;j>i; j--) {
				System.out.print((char)q+"");
				q--;
			}
			System.out.println();
			
			}
	      
}
}
