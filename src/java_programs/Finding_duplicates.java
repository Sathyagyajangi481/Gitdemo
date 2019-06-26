package java_programs;

public class Finding_duplicates {

	public static void main(String[] args) {
		int[]x={12,34,34,27,87,5,5,78,78};

		for(int i=1;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
				
			{
				if(x[i]==x[j])
				{
				System.out.print(x[i] +" ");
				}
					
					
			}
			
		}
	
	}

}
