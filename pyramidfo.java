package alphapattern;

public class pyramidfo {
	



            
	public static void main(String[] args)  
	{  
		for (int i = 1, q=1; i <= 4; i++,q++)   
		{  
			 
			for (int j = 4; j > q; j--)  
			{  
				System.out.print(" ");  
			} 
             int s= 'a';
			for (int k = 1; k <= i; k++, s++)  
			{  
				System.out.print( (char)s+" ");  
			}  
		System.out.println();  
		}  
	}  
}  


