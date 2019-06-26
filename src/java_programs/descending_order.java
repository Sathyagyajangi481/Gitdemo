package java_programs;

public class descending_order {

	public static void main(String[] args) 
	{
	int[] y={123,67,89,35,899,3445,2341};
	
	int temp=0;
	int L=y.length;

	for(int i=0;i<L;i++)
	{
		
		for(int j=i+1;j<L;j++)
		if(y[i]<y[j])
		{
			temp=y[i];
			y[i]=y[j];
			y[j]=temp;
		}
	}
	
	for(int z:y)
	{
		System.out.println(z);
	}
	
	}

}
