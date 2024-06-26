package alphapattern;

public class Alphadoublehill{
	public static void main(String[] args) {
		
	
	    for(int i= 1; i<=5; i++) {
	    	 for(int j=1; j<=i; j++) {
	    		 if(i%2==0) {
	    			 System.out.print('B');
	    		 }else {
	    			 System.out.print('A');
	    		 }
	    	 }
	    	 //System.out.println();
	     
	     
	     
	    	 
	    	 for(int s=1; s<=(10-i)-(i-1); s++) {
	    		 System.out.print(" ");
	    	 }
	    	 int q='A';
	    	  for(int r=1; r<=i; r++,q++) {
	    		  System.out.print((char)q+"");
	    	  }
	    	  System.out.println();
	     }
	
}
}

