/**
 * A program that implements algorithm with Java.
 * 
 * */

package java_algorithm;

public class MyString {

	// Question:  https://www.shiyanlou.com/courses/492/labs/1624/document
	// For a given source string and a target string, you should output
	// the first index(from 0) of target string in source string.
	// If target does not exist in source, just return -1.
	//
	public static int strstr(String source, String target ) {
		int gap = source.length() - target.length();
		
		if( gap < 0 )  
			return -1;
		
		int i = 0;
		int j, k;
		while( i <= gap ) {
			k = i;
			for( j = 0; j < target.length(); j++ ) {
				if( target.charAt(j) == source.charAt(k) )
					k++;
				else
					break;
			}
			
			// if OK, found
			if( k == (i + target.length()) ) {
				return i;
			}
			else {
				// not equal
				i++;
			}
		}
			
		return -1;
	}
	
	
	// test function
	public static void main(String[] args) {
		String s1, t1;
		String s2, t2;
		
		s1 = new String("source");
		t1 = new String("target");
		System.out.println(strstr(s1, t1));
		
		s2 = new String("abcdabcdefg");
		t2 = new String("bcd");
		System.out.println(strstr(s2, t2));
	}
}
