/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author cgoodale
 *
 */
public abstract class Shape {

	/* Methods for the abstract class*/
	
	// Method for the surface area of the shape
	abstract float surfaceArea();
	
	// Method for finding the volume of a shape
	abstract float volume();
	
	// Method for rendering a text box with dimensions, area, and volume.
	abstract void render();
	
	
}
