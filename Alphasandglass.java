package alphapattern;

public class Alphasandglass {
	
	     
	public static void main(String[] args) {
		int a= 'A';
		int b= 'D';
		     for(int i=1; i<=5; i++) {
		    	 
		    	 for(int s=1; s<i; s++) {
		    		 
		    		 System.out.print(" ");
		    		 
		    	 }
		    	 
		    	 for(int j=1; j<=(10-i)-(i-1); j++) {
		    		 System.out.print((char)a+"");
		    		 
		    	 }
		    	 System.out.println();
		    	 a++;
		    	 
		     }
		     
		     
		     for(int p=6;p<=9;p++) {
		    	 
		    	 for(int q=p; q<9; q++) {
		    		 System.out.print(" ");
		    		 
		    	 }
		    	 
		    	 for(int r=1; r<=(3*p - 15)-(p-6); r++) {
		    		 
		    		 System.out.print((char)b+"");
		    	 }
		    	 System.out.println();
		    	 b--;
		     }
	}
	

}
