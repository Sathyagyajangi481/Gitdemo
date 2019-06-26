package java_programs;

public class max_min {

	public static void main(String[] args) {
		
		int[]x={11,23,23,4525,567,56};
		
		int min=x[0];
		int max=x[0];
		
		int n=x.length;
		for(int i=1;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
			}
			else
				if(x[i]<min)
				{
					min=x[i];
				}
		
		System.out.println("largest number" +" "+max);
		
		System.out.println("smallest number" +" "+min);
		
		}
		
		
	}

}
