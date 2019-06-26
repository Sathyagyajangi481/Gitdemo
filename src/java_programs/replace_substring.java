package java_programs;

public class replace_substring {

	public static void main(String[] args) 
	
		
		 {
			String str = "I use selenium webdriver. selenium is a tool for web applications automation.";
			String toBeReplaced = "selenium";
			String toReplacedWith = "Firefox";
			String[] astr = str.split(toBeReplaced);
			
			int n=astr.length;
			System.out.println(n);
			StringBuffer strb = new StringBuffer();
			
			
			for ( int i = 0; i <= n- 1; i++ ) 
			{
			strb = strb.append( astr[i] );
			if (i != astr.length - 1) {
			strb = strb.append(toReplacedWith);
			}
			}
			System.out.println(strb);


	
		 }

}
