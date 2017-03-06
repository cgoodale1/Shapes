
package org.cvtc.shapes;

/**
 * @author Connor
 *
 */
public class Cylinder extends Shape{
	
	/**
	 * The radius of the Cylinder
	 */
	private float radius = 0.0f;
	
	/**
	 * The height of the Cylinder
	 */
	private float height = 0.0f;
	
	/**
	 * Gets the radius of the Cylinder
	 */
	public float getRadius() {
		return radius;
	}
	
	/**
	 * Sets the radius of the Cylinder
	 */
	private void setRadius(float radius) {
		this.radius = radius;
	}

	/**
	 * Gets the height of the Cylinder
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * Sets the height of the Cylinder
	 */
	private void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @param radius
	 * @param height
	 */
	public Cylinder(Dialog dialog, float radius, float height) {
		super(dialog);
		
		if (radius >=0){
			setRadius(radius);
		}
		
		
		if (height >=0){
			setHeight(height);
		}
	}
	
	@Override
	public float surfaceArea() {
		
		
		return ((2 * (float)Math.PI * (getRadius() * getRadius())) + (2 * (float)Math.PI * getRadius() * getHeight()));
	}

	
	@Override
	public float volume() {
		
		
		return ((float)Math.PI * (getRadius() * getRadius()) * getHeight());
	}

	
	@Override
	public String render() {
		
		return "Sureface Area: " + surfaceArea() + "\nVolume: " + volume();
	}
	
	
	
	

}
