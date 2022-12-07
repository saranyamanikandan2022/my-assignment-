package week2;

public class DuplicateInArray {
	public static void main(String[] args)
	{
		int[] array= {70,55,3,70,55,54,28,55,70,19,78,34,70};
		int arraylength=array.length;
	for(int i=0;i<arraylength-1;i++) {
		int count=1;
	for(int j=i+1;j<arraylength-1;j++) {
		if(array[i]==array[j]) {
			count=count+1;
			}
		}
			if(count>1) {
				System.out.println(array[i]);
				}
			}

	}

}


