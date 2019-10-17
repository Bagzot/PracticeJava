package practiseJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElemPractice {

	public static void main(String[] args) {
		
		String s[] = {"apple","banana","straberry","blueberry","banana"};
		
		for(int i=0;i<s.length;i++) {
			
			for(int j=i+1;j<s.length;j++) {
			
				if(s[i].equals(s[j])) {
			
			System.out.println("duplicate element is:" + s[i]);
			System.out.println(Arrays.toString(s));
		}}}
	
		System.out.println("\n*****************\n");
		
		Set<String> storeElem = new HashSet<String>();
		for(String ss :s) {
			if(storeElem.add(ss)==false) {
				System.out.println("duplicate element is:" +ss);
			}
		}
		
		
		
		
		
		
		
		
	}

}
