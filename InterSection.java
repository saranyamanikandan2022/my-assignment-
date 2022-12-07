package week2;

public class InterSection {
	public static void main(String[] args) 
	{
		int array[]= {5,2,3,8,6,7,9};
		int array1[]= {2,14,5,9,3,7};
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array1.length;j++)
		{
				if(array[i]==array1[j])
				{
				System.out.println(array[i]);

				}
					
		}
		}

	}
	

}
