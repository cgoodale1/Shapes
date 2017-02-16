/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author cgoodale
 *
 */
public class Sphere extends Shape {
	
	// The radius of the sphere
	private float radius = 0.0f;
	
	
	public Sphere(float radius) {
		
		// See if the user enters a negative value, if so please replace with a 1.
		if (radius <= 0) {
			radius = 1;
			System.out.println("Cannot use negative for radius. Default value of 1 set.");
		}
		
		// Set the dimensions of this sphere
		setRadius(radius);
	}
	
	
	
	@Override
	float surfaceArea() {
		// Equation for the surface area of a sphere
		return ((4 * (float)Math.PI) * (getRadius() * getRadius()));
	}


	
	
	@Override
	float volume() {
		// Equation for the volume of a sphere
		return ((4 / 3) * ((float)Math.PI) * (getRadius() * getRadius() * getRadius()));
						
	}


	
	
	@Override
	void render() {
		// JOptionPane to show a popup box displaying data about the object
		JOptionPane.showMessageDialog(null, ("Sphere Radius: " + getRadius() + ".\nSphere Surface Area: " + surfaceArea() + ".\nSphere Volume: " + volume() + "."));
		return;
	}
	
	
	// getters and setters for the sphere
	
	public float getRadius() {
		return radius;
	}
	
	
	public void setRadius(float radius) {
		this.radius = radius;
	}

}
