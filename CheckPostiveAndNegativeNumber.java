package week2;

public class CheckPostiveAndNegativeNumber {
	
	public static void main(String[] args) 
    {
       int num = 3;
       if(num > 0)
         System.out.println(num+" is a positive number");
       else if(num < 0)
         System.out.println(num+" is a negative number");
       else   
         System.out.println(num+" is neither positive nor negative");
    }
}
