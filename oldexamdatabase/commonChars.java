/* Write a method commonChars that takes two strings as parameters and 
that returns a string representing the characters they have in common. 
The characters that are different between the two strings should be 
represented by a “.” in the returned string. You can assume the two 
strings passed in to the method contain no “.” characters. 

For example, the following calls:

commonChars(“foo”, “oof”);
commonChars(“dog person”, “cat perSon”);
commonChars(“hello”, “jello”);

should return the following strings:

“.o.”
“... per.on”
“.ello”

Notice that in the second call, ‘s’ and ‘S’ do not match, 
because they have different casing. 

You must exactly reproduce the format of these examples. Your method 
should throw an IllegalArgumentException if the two strings are of 
different length. You may NOT use a while loop, for loop or do/while 
loop to solve this problem; you must use recursion. */ 
// Most clear version
public String commonChars(String s1, String s2) {
	if (s1.length() != s2.length()) {
		throw new IllegalArgumentException();
	}
	if (s1.length() == 0) {
		return "";
	} else if (s1.charAt(0) == s2.charAt(0)) {
		String temp = "";
		if (s1.charAt(0) == ' ') {
			temp = " ";
		} else {
			temp = "" + s1.charAt(0);
		}
		return temp + commonChars(s1.substring(1), s2.substring(1));
	} else {
		return "." + commonChars(s1.substring(1), s2.substring(1));
	}
}

// Least redundant version
public String commonChars(String s1, String s2) {
	if (s1.length() != s2.length()) {
		throw new IllegalArgumentException();
	}
	if (s1.length() == 0) {
		return "";
	String temp = "";	
	} else if (s1.charAt(0) == s2.charAt(0)) {
		if (s1.charAt(0) == ' ') {
			temp = " ";
		} else {
			temp = "" + s1.charAt(0);
		}
	} else {
		temp = ".";
	}
	return temp + commonChars(s1.substring(1), s2.substring(1));
}