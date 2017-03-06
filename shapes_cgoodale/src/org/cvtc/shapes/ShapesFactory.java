/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Connor
 *
 */
public class ShapesFactory {

	public Shape createCuboid(Dialog dialog, float width, float height, float depth) {
		return new Cuboid(dialog, width, height, depth);
		
	}
	
	public Shape createCylinder(Dialog dialog, float radius, float height) {
		return new Cylinder(dialog, radius, height);
		
	}
	
	public Shape createSphere(Dialog dialog, float radius) {
		return new Sphere(dialog, radius);
		
	}
}