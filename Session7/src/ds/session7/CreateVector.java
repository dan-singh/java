package ds.session7;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;


public class CreateVector {

public static void main(String[] args) {

	// initialize array with some data
	String[] sa = new String[] { "A", "B", "C" };
	// convert array to Vector
	Vector v = new Vector(Arrays.asList(sa));
	Vector<String> objVector = new Vector<String>(50);

	// iterate over each element in Vector
	Iterator iterator = v.iterator();
	while (iterator.hasNext()) {
		// Print element to console
		System.out.println((String) iterator.next());
	}
	}
}
