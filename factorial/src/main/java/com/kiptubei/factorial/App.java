package com.kiptubei.factorial;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int number, factorial;
        factorial = 1;
        number =0;
        
        for(int i=1; i<=number && number>0; i++) {
        	factorial = factorial * i;        	
        }
        
        System.out.println("Factorial of "+number+" = "+ factorial);
    }
    
}
