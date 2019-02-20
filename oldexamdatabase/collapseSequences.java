/* Write a recursive method called collapseSequences that takes a string 
and a character as parameters and that returns a new string that has all 
sequences of the given character collapsed to one of that character. A 
sequence is a group of consecutive characters that are all the same. 
Consider the following call: 

collapseSequence("-this----has maaany--dashes---", '-')

The string has 5 sequences of dashes of varying lengths. Each is reduced 
to a single occurrence of the dash producing "-this-has maaany-dashes-". 
Notice that other characters are unchanged. If you make the call: 

collapseSequence("eecckk!!, he's meeeping meep", 'e')

the method should return "ecckk!!, he's meping mep". In implementing 
this method, you are restricted to the following string methods: 

charAt(index)            returns the character at the given index

length()                 returns the length of the string

substring(start, stop)   returns a new string composed of characters
                         from start index (inclusive) to stop index
                         (exclusive)

substring(start)         returns a new string composed of characters
                         from start index (inclusive) to the string end
						 
You are not allowed to construct any structured objects other than 
Strings (no array, ArrayList, StringBuilder, Scanner, etc) and you may 
not use a while loop, for loop or do/while loop to solve this problem; 
you must use recursion. */

// This problem was really, really hard and I feel bad for the students that
// had to do it for a test. This is the most clear way that definitively
// outlines cases.
public String collapseSequence(String s, char ch) {
	if (s.length() == 0) {
		return "";
	} else if (s.charAt(0) == ch) {
		if (s.length() == 1 || s.charAt(1) != ch) {
			return s.substring(0, 1) + collapseSequence(s.substring(1), ch);
		} else {
			return collapseSequence(s.substring(1), ch);
		}
	} else {
		return s.substring(0, 1) + collapseSequence(s.substring(1), ch);
	}
}

// This is the reduced redundancy version. In my opinion, this is much
// more confusing that the first one, but obviously others will disagree.
public String collapseSequence(String s, char ch) {
	if (s.length() == 0) {
		return "";
	} else if (s.charAt(0) == ch && s.length() != 1 && s.charAt(1) == ch) {
		return collapseSequence(s.substring(1), ch);
	} else {
		return s.substring(0, 1) + collapseSequence(s.substring(1), ch);
	}
}
		