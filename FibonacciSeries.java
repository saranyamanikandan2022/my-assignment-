package week2;

public class FibonacciSeries {
	
		public static void main(String[] args) {
		   int firstTerm=0;
		    int secondTerm=1;
		    int sum;
System.out.println(firstTerm +" "+secondTerm);
		 for(int i=2;i<=8;++i) //loop starts from 2 because 0 and 1 are already printed    
	 {    
	  sum=firstTerm+secondTerm;    
	  System.out.println(""+sum);    
	  firstTerm=secondTerm;    
	  secondTerm=sum;    
}
}
}

  

/*
public static void main(String[] args) 
{
	int firstNum=0;
	int secNum=1;
	int sum;
	

	System.out.println(firstNum);
	for(int i=1;i<=8;i++)
	{
		sum=firstNum+secNum;
		System.out.println(sum);
		firstNum=secNum;
		secNum=sum;
		
	}*/
