package week2;

public class FibonacciSeries {
	
		public static void main(String[] args) {
		   int firstTerm=0;
		    int secondTerm=1;
		    int sum;
System.out.println(firstTerm);
		 for(int i=2;i<=8;++i) //loop starts from 2 because 0 and 1 are already printed    
	 {    
	  sum=firstTerm+secondTerm;    
	  System.out.println(sum);    
	  firstTerm=secondTerm;    
	  secondTerm=sum;    
}
}
}

  


