package java_programs;

public class reverse_string {

	public static void main(String[] args) {
		
		
		String str="be a good human";
		
		int i= str.length();
		System.out.println(i);
	
		StringBuffer sb= new StringBuffer();
		
		for(int j=i-1;j>=0;j--)
		{
			sb=sb.append(str.charAt(j));
		}
		System.out.println(sb);
	}

}
