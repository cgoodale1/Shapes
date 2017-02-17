package org.cvtc.shapes.tests;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.junit.Test;



public class CylinderTest {

	// Test the cylinder height
	@Test
	public void heightOfCylinder() {

		Cylinder cylinder = new Cylinder(1.0f, 2.0f);
		float expected = 2.0f;

		float actual = cylinder.getHeight();

		assertTrue("Error with the cylinder height", actual==expected);
	}
	
	// Tests the cylinder radius
	@Test
	public void radiusOfCylinder() {
		
		Cylinder cylinder = new Cylinder(2.0f, 1.0f);
		float expected = 2.0f;

		float actual = cylinder.getRadius();

		assertTrue("Error with the cylinder radius", actual==expected);
	}
	
	// Tests that the constructor does take negative numbers
	@Test
	public void constructorCylinder() {

		Cylinder cylinder = new Cylinder(-3.0f, -4.0f);
		float expected = 0.0f;

		float actual = cylinder.getRadius();

		assertTrue("Error in cylinder constructor", actual==expected);
	}
	
	// Tests if a positive number works
	@Test
	public void surfaceAreaOfCylinderPositive() {

		Cylinder cylinder = new Cylinder(1.0f, 1.0f);
		float expected = 12.566371f;

		float acutal = cylinder.surfaceArea();

		assertTrue("Error with surfaceArea of cylinder Positive", acutal==expected);
		
	}
	
	// Tests if a negative number doesn't work
	@Test
	public void surfaceAreaOfCylinderNegative() {
		
		Cylinder cylinder = new Cylinder(-10.0f, -1.0f);
		float expected = 0.0f;

		float acutal = cylinder.surfaceArea();

		assertTrue("Error with surfaceArea of cylinder Negative", acutal==expected);
		
	}
	
	// Tests if a zero number works
	@Test
	public void surfaceAreaOfCylinderZero() {

		Cylinder cylinder = new Cylinder(0.0f, 0.0f);
		float expected = 0.0f;
		
		float acutal = cylinder.surfaceArea();

		assertTrue("Error with surfaceArea of cylinder Zero", acutal==expected);
		
	}
	
	// Tests if a positive number works
	@Test
	public void volumeOfCylinderPositive() {
		
		Cylinder cylinder = new Cylinder(1.0f, 1.0f);
		float expected = 3.1415927f;

		float actual = cylinder.volume();

		assertTrue("Error with volume of cylinder Positive", actual==expected);
	}
	
	// Tests if a negative number doesn't work
	@Test
	public void volumeOfCylinderNegative() {

		Cylinder cylinder = new Cylinder(-11.0f, -11.0f);
		float expected = 0.0f;

		float actual = cylinder.volume();

		assertTrue("Error with volume of cylinder Negative", actual==expected);
	}
	
	// Tests to see if a zero works
	@Test
	public void volumeOfCylinderZero() {

		Cylinder cylinder = new Cylinder(0.0f, 0.0f);
		float expected = 0.0f;

		float actual = cylinder.volume();

		assertTrue("Error with volume of cylinder Zero", actual==expected);
	}
	
	@Test(expected = Exception.class)
	public void expectedException() throws Exception {
		throw new Exception();
	}
	

}