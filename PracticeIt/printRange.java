/* Write a method printRange that accepts integer parameters x and y and 
that prints the sequential integers between x and y inclusive. The first 
half should be printed with the greater-than character (">") separating 
consecutive values. The second half should be printed with the less-than 
character ("<") separating consecutive values. 

Notice that in the first output, 5 is in the middle with the numbers 
before it separated by greater-than and the numbers after it separated 
by less-than. In the second output, 15 is in the middle with numbers 
before it separated by greater-than and numbers after it separated by 
less-than. The third output has no separators because that range 
includes one number. When there are two values in the middle of the 
range, those two values should be separated by a dash, as shown in the 
last two outputs. 

The method should throw an IllegalArgumentException if x is greater than 
y. */
public void printRange(int x, int y) {
	if (x > y) {
		throw new IllegalArgumentException();
	}
	if (x - y == 0) {
		System.out.print(x);
	} else if (y - x == 1) {
		System.out.print(x + " - " + y);
	} else {
		System.out.print(x + " > ");
		printRange(x + 1, y - 1);
		System.out.print(" < " + y);
	}
}