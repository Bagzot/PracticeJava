package practiseJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		String names[] = {"java","selenium","java","python","c++","c#"};

		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
				System.out.println("Duplicate element is:" + names[i]);	
				}
			}
		}
		System.out.println("**********************");
		
		//2.Using HashSet : java collection:it stores unique value :0(n)
		Set<String> ss = new HashSet<String>();
		for(String name:names) {
		if(ss.add(name)==false) {
			System.out.println("Duplicate element is:" + name);
		}
		}
	}

}
