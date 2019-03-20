/* You have been asked to extend the Point class that represents 2-D (x, 
y) coordinates. The Point class includes the following public 
constructors and methods: 

Method/Constructor	Description
public Point()	constructs the point (0, 0)
public Point(int x, int y)	constructs a point with the given x/y coordinates
public void setLocation(int x, int y)	sets the coordinates to the given values
public int getX()	returns the x-coordinate
public int getY()	returns the y-coordinate
public String toString()	returns String in standard "(x, y)" notation
public double distanceFromOrigin()	returns the distance from the origin (0, 0) computed as the square root of (x2 + y2)

You are to define a new class called Point3D that extends this class 
through inheritance. It should behave like a Point except that it should 
be a 3-dimensional point that keeps track of a z-coordinate. You should 
provide the same methods as the superclass, as well as the following new 
behavior: 


Method/Constructor	Description
public Point3D()	constructs the point (0, 0, 0)
public Point3D(int x, int y, int z)	constructs a point with the given x/y/z coordinates
public void setLocation(int x, int y, int z)	sets the coordinates to the 
given values
public int getZ()	returns the z-coordinate

Some of the existing behaviors from Point should behave differently on Point3D objects:

When the original 2-parameter version of the setLocation is called, the 
3-D point's x/y coordinates should be set as specified, and the 
z-coordinate should be set to 0. 

When a 2-D point is printed with toString, it should be returned in an 
"(x, y, z)" format that shows all three coordinates. 

A 3-D point's distance from the origin is computed using all three 
coordinates, it is equal to the square root of (x2 + y2 + z2). 

You must also make Point3D objects comparable to each other using the 
Comparable interface. 3-D points are compared by x-coordinate, then by 
y-coordinate, then by z-coordinate. In other words, a Point3D object 
with a smaller x-coordinate is considered to be "less than" one with a 
larger x-coordinate. If two Point3D objects have the same x-coordinates, 
the one with the lower y-coordinate is considered "less". If they have 
the same x and y-coordinates, the one with the lower z-coordinate is 
considered "less". If the two points have the same x, y, and 
z-coordinates, they are considered to be "equal". */ 

public class Point3D extends Point implements Comparable<Point3D> {
    
	private int z;
	
	public Point3D(int x, int y, int z) { 
		setLocation(x, y, z);
	}
	
	public Point3D() {
		this(0, 0, 0);
	}
	
	public void setLocation(int x, int y, int z) {
		super.setLocation(x, y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	
	@Override
	public void setLocation(int x, int y) {
		setLocation(x, y, 0);
	}
	
	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + z + ")";
	}
	
	@Override
	public double distanceFromOrigin() {
		return Math.sqrt(getX() * getX() + getY()* getY() + z * z);
	}
	
	@Override
	public int compareTo(Point3D other) {
		if (getX() - other.getX() != 0) {
			return getX() - other.getX();
		} else if (getY() - other.getY() != 0) {
			return getY() - other.getY();
		} else {
			return z - other.z;
		}
	}
}
