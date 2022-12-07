package week2;

import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) 
	{
		int[] arr = {1,2,4,5,8,9};
		Arrays.sort(arr);
		int arrlen=arr.length;
		System.out.println(arrlen);
		for(int i=0;i<arr.length;i++)
		{
			int arr1=i+1;
			{
			if(arr1!=arr[i])
			{
				System.out.println(arr1);
			break;
				
			}
			}
			
			
		}

		
	}
}
