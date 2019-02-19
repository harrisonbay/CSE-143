/* Write a method starString that accepts an integer parameter n and 
returns a string of stars (asterisks) 2n long (i.e., 2 to the nth 
power). You should throw an IllegalArgumentException if passed a value 
less than 0. */
public String starString(int n) {
	if (n < 0) {
		throw new IllegalArgumentException();
	}
	if (n == 0) {
		return "*";
	} else {
		String s = starString(n - 1);
		return s + s;
	}
}