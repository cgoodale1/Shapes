/**
 * 
 */
package org.cvtc.shapes;


/**
 * @author Connor
 *
 */
public class ShapesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Dialog dialog = new MessageBox();
		/**
		 * Creates a new instance of a cuboid
		 */
		Cuboid cuboid = new Cuboid(dialog, 10, 10, 10);
		
		/**
		 * Creates a new instance of a cylinder
		 */
		Cylinder cylinder = new Cylinder(dialog, 1, 1);
		
		/**
		 * Creates a new instance of a sphere
		 */
		Sphere sphere = new Sphere(dialog, 2);
		
		/**
		 * Displays the cuboid results in a message box
		 */
		cuboid.render();
		
		/**
		 * Displays the sphere results in a message box
		 */

		sphere.render();
		
		/**
		 * Displays the cylinder results in a message box
		 */
		
		cylinder.render();
		
	}

}