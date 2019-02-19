/* Write a method commonFirstLetters that accepts a list of strings as a 
parameter, and returns a Set of strings. Your method should examine the 
strings in the list passed and return a set of all first letters that 
occur more than once. In other words, if two or more strings in the list 
begin with a particular character (case-insensitively), that letter 
should be part of the set that you return. 



Consider a list variable called list containing the following elements:

["hi", "how", "is", "He", "Marty!", "this", "morning?", "fine.", "?huh?", "HOW", "I"]

One word in the list begins with "f", four begin with "h", two begin 
with "i", two begin with "m", one begins with "t", and one begins with 
"?". Therefore the set you return should contain the following elements: 



["h", "i", "m"]

If no first character occurs 2 or more times, return an empty set. The 
order the elements appear in the set does not matter. You may assume 
that the list passed is not null and that none of its elements are null 
or empty strings. 

Obey the following restrictions in your solution: 

You may create only up to two (2) new data structures of your choice 
(list, stack, queue, set, map, etc.) as auxiliary storage. (You can have 
as many simple variables as you like.) 

Your solution should run in less than O(N2) time, where N is the number 
of strings in the list. 

You should not modify the contents of the list passed to your method. */ 

public Set<String> commonFirstLetters(List<String> list) {
	Set<Character> letters = new HashSet<Character>();
	Set<String> result = new HashSet<String>();
	for (String s : list) {
		char temp = Character.toLowerCase(s.charAt(0));
		if (letters.contains(temp)) {
			result.add("" + temp);
		}
		letters.add(temp);
	}
	return result;
}