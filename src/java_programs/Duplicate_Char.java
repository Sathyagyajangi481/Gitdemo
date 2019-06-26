package java_programs;

import java.util.HashMap;

public class Duplicate_Char {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> hm = new HashMap<>();
		String str = "hgfadsgflajdig";
		char charArr[] = str.toCharArray();
		for(char ch : charArr){
			if(hm.containsKey(ch)){
				
				hm.put(ch, hm.get(ch)+1);
			}else{
				hm.put(ch, 1);
			}
		}
		for(char ch : hm.keySet()){
			System.out.println(ch+ " "+ hm.get(ch)+ " "+ str.indexOf(ch));
		}
	}

}
