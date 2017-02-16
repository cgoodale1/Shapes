/**
 * 
 */
package org.cvtc.shapes;


import javax.swing.JOptionPane;

/**
 * @author cgoodale
 *
 */
	
public class Cylinder extends Shape {
	
	// The height of the Cylinder
	private float height = 0.0f;
	
	// The radius of the Cylinder
	private float radius = 0.0f;
	
	
	public Cylinder(float radius, float height) {
		
		// See if the user enters a negative value, if so please replace with a 1.
		if (radius <= 0) {
			radius = 1;
			System.out.println("Cannot use negative for radius. Default value of 1 set");
		}
		
		// See if the user enters a negative value, if so please replace with a 1.
		if (height <= 0) {
			height = 1;
			System.out.println("Cannot use negative for height. Default value of 1 set");
		}
		
		// Set the dimensions of this Cylinder
		setHeight(height);
		setRadius(radius);
	}
	
	
	

	@Override
	float surfaceArea() {
		// Equation for the surface area of a cylinder
		return ((2 * ((float)Math.PI) * (getRadius() * getRadius())) + (2 * ((float)Math.PI) * (getRadius()) * (getHeight())) );
		
	}

	
	@Override
	float volume() {
		// Equation for the surface area of a cylinder
		return (((float)Math.PI) * (getRadius() * getRadius()) * (getHeight()));
	}

	
	
	@Override
	void render() {
		// JOptionPane to show a popup box displaying data about the cylinder
		JOptionPane.showMessageDialog(null, ("Cylinder Radius: " + getRadius() + ".\nCylinder Height: " + getHeight() + ".\nCylinder Surface Area: " + surfaceArea() + ".\nCylinder Volume: " + volume() + "."));
		return;

	}

	// getters and setters for the cylinder
	
	public float getHeight() {
		return height;
	}

	
	public void setHeight(float height) {
		this.height = height;
	}

	
	public float getRadius() {
		return radius;
	}

	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
}
