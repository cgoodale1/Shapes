/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Connor
 *
 */
public class Sphere extends Shape{
	
	/**
	 * the radius of the Sphere
	 */
	private float radius = 0.0f;

	/**
	 * Gets the radius of the Sphere
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * Sets the radius of the Sphere
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}

	/**
	 * @param radius
	 */

	public Sphere(Dialog dialog, float radius) {
		super(dialog);
		
		if (radius >=0){
			setRadius(radius);
		}
	}

	
	@Override
	public float surfaceArea() {
		
		
		return (4 * (float)Math.PI * (getRadius() * getRadius()));
	}

	
	@Override
	public float volume() {
		
		
		return ((4/3) * (float)Math.PI * (getRadius() * getRadius() * getRadius()));
	}

	
	@Override
	public String render() {
		
		return "Surface Area: " + surfaceArea() + "\nVolume: " + volume();
	}
}
