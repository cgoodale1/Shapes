/**
 * 
 */
package org.cvtc.shapes;

import java.util.Scanner;

/**
 * @author cgoodale
 *
 */
public class ShapesTest {
		
		public static Scanner keyboard = new Scanner(System.in);
		
		// This is the main method 
		public static void main(String[] args) {
			
			// Variable / Object initialization
			Shape cuboid = new Cuboid(100, 75, 50);
			Shape cylinder = new Cylinder(50, 75);
			Shape sphere = new Sphere(50);
			
			// Print out the default values
			
			System.out.println("Default Value for all Radius and Depth = 50");
			System.out.println("Default Value for all Height = 75");
			System.out.println("Default Value for all width = 100");
			
			System.out.println("Now Calculating Surface Area and Volume for each Shape.");
			
			// Print out the rendering methods
			
			System.out.println("Rendering your Shapes!");
			
			cuboid.render();
			cylinder.render();
			sphere.render();
			
			
		}
	
}
