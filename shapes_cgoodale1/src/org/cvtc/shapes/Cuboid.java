/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author cgoodale
 *
 */

// Class for the cuboid shape.

public class Cuboid extends Shape {
	
	// width of the cuboid
	private float width = 0.0f;
	
	// the height of the cuboid 
	private float height = 0.0f;
	
	// the depth of the cuboid
	private float depth = 0.0f;
	
	
	
	
	// Set a new instance of the cuboid using the passed in parameters.
	public Cuboid(float width, float height, float depth) {
		
		// See if the user enters a negative value, if so please replace with a 1.
		if (width <= 0) {
			width = 1;
			System.out.println("Cannot use negative for width. Default value of 1 set");
		}
		
		// See if the user enters a negative value, if so please replace with a 1.
		if (height <= 0) {
			height = 1;
			System.out.println("Cannot use negative for height. Default value of 1 set");
		}
		
		// See if the user enters a negative value, if so please replace with a 1.
		if (depth <= 0) {
			depth = 1;
			System.out.println("Cannot use negative for depth. Default value of 1 set");
		}
				
		// Set the dimensions of the Cuboid
		setWidth(width);
		setHeight(height);
		setDepth(depth);

	}
	
	
	
	@Override
	float surfaceArea() {
		// returns the surface area of a cuboid
	return getWidth() * getDepth() * getHeight() * (float)Math.PI;
	}

	
	
	@Override
	float volume() {
		// Volume is found by multiplying the surface area by the Depth
		return surfaceArea() * getDepth();
	}

	
	
	
	@Override
	void render() {
		// JOptionPane to show a popup box displaying the information abour the cuboid.
		JOptionPane.showMessageDialog(null, ("Cuboid width: " + getWidth() + ".\nCuboid Depth: " + getDepth() + ".\nCuboid Height: " + getHeight() + ".\nCuboid Surface Area: " + surfaceArea() + ".\nCuboid Volume: " + volume() + "."));
		return;

	}
	
	// Below are the getters and setters for the cuboid
	
		private float getWidth() {
			return width;
		}

		
		private void setWidth(float width) {
			this.width = width;
		}
		
		
		private float getHeight() {
			return height;
		}
		
		
		private void setHeight(float height) {
			this.height = height;
		}
		
	
		private float getDepth() {
			return depth;
		}

		
		private void setDepth(float depth) {
			this.depth = depth;
		}


}
