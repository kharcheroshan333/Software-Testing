package alphapattern;

public class Alpharevtriangle {
	
	public static void main(String[] args) {
		     int a='E';
		      for( int i=1; i<=5; i++,a--) {
		    	  
		    	  for(int s=1; s<i; s++) {
		    		  System.out.print(" ");
		    		  
		    	  }
		    	  
		    	  for(int j=5;j>=i; j--) {
		    		  System.out.print((char)a+"");
		    		  
		    	  }
		    	  System.out.println();
		    	  //a--;
		      }
	}

}
