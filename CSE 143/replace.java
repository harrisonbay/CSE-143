/* Write a recursive method called replace that takes a string and two 
characters as parameters and that returns a new string with all 
occurrences of the first character replaced by the second character. The 
table below indicates the result of various method calls: 



        Method Call                                   Result
        ----------------------------------------------------------------------
        replace("to be or not to be", 'e', 'o');      "to bo or not to bo"
        replace("to be or not to be", 'o', '-');      "t- be -r n-t t- be"
        replace("to be or not to be", 'm', '!');      "to be or not to be"
        replace("Mississippi", 'i', 'e');             "Messesseppe"
        replace("hah!", 'h', '*');                    "*a*!"
        replace("Hah!", 'h', '*');                    "Ha*!"
        replace("", 'g', 'h');                        ""
		
You are restricted to the following String methods:

        charAt(index)                  returns the character at the given index
        length()                       returns the length of the string
        substring(fromIndex, toIndex)  returns a new string that is a substring
                                       of this string from startIndex
                                       (inclusive) to stopIndex (exclusive)
        substring(fromIndex)           Returns a new string that is a substring
                                       of this string from startIndex
                                       (inclusive) to the end of the String
									   
For example, if a String s stores the text "hello", then:

        s.charAt(0) returns 'h'        s.substring(1, 3) returns "el"
        s.length() returns 5           s.substring(2) returns "llo"
		
You will be constructing new strings, but you are not allowed to 
construct any other structured objects (no array, ArrayList, 
StringBuilder, etc) and you may not use a while loop, for loop, or 
do/while loop to solve this problem; you must use recursion. */

public String replace(String s, char c1, char c2) {
	if (s.length() == 0) {
		return "";
	} else {
		if (s.charAt(0) == c1) {
			// apparently this works even if s.length() == 1
			s = c2 + s.substring(1);
		}
		return s.substring(0, 1) + replace(s.substring(1), c1, c2);
	}
}