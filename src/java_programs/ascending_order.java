package java_programs;

import java.lang.reflect.Array;

public class ascending_order {

	public static void main(String[] args) {
	int[] x={127,23,46,78,258};
	
	int temp=0;
	for(int i=0;i<x.length;i++)
	{
		for(int j=i+1;j<x.length;j++)
		{
			if(x[i]>x[j])
			{
				temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}
		}
	}
	for(int k:x)
	{
		System.out.println(k);
	}
	System.out.println("second highest :" + x[x.length-2]);
	
}
}
