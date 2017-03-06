package org.cvtc.shapes.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.cvtc.shapes.*;
import org.cvtc.tests.substitutes.MessageBoxSub;

public class CuboidTest {


	// Tests the width of the Cuboid class
	@Test
	public void widthOfCuboid() {

		Cuboid cuboid = new Cuboid(2.0f, 2.0f, 2.0f);
		float expected = 2.0f;

		float actual = cuboid.getWidth();

		assertTrue("Error with cuboid width", actual==expected);
		
		
	}
	
	// Tests the height of the Cuboid class
	@Test
	public void heightOfCuboid() {

		Cuboid cuboid = new Cuboid(3, 3, 3);
		float expected = 3.0f;
		
		float actual = cuboid.getHeight();

		assertTrue("Error with cuboid height", actual==expected);
	}
	
	// Tests the depth of the Cuboid class
	@Test
	public void depthOfCuboid() {
		
		Cuboid cuboid = new Cuboid(4, 4, 4);
		float expected = 4.0f;

		float actual = cuboid.getDepth();

		assertTrue("Error with the cuboid depth", actual==expected);
	}
	
	// Test that the constructor doesn't take negative numbers
	@Test
	public void cuboidConstructor() {

		Cuboid cuboid = new Cuboid(-1.0f, -1.0f, -1.0f);
		float expected = 0.0f;

		float actual = cuboid.getWidth();
		
		assertTrue("Error in cuboid constructor logic", actual==expected);
	}
	
	// Make sure surface area works wih positive numbers
	@Test
	public void cuboidSurfaceAreaPositive() {

		Cuboid cuboid = new Cuboid(10, 10, 10);
		float expected = 600.00f;

		float actual = cuboid.surfaceArea();

		assertTrue("Error in cuboid surface area Positive", actual==expected);
	}
	
	// Make sure suface area works with 0
	@Test
	public void cuboidSurfaceAreaZero() {

		Cuboid cuboid = new Cuboid(0, 0, 0);
		float expected = 0.0f;

		float actual = cuboid.surfaceArea();

		assertTrue("Error in cuboid sureface area Zero", actual==expected);
	}
	
	// Tests that the surface area method to see that negative numbers don't work
	@Test
	public void cuboidSurfaceAreaNegative() {

		Cuboid cuboid = new Cuboid(-10, -10, -10);
		float expected = 0.0f;

		float actual = cuboid.surfaceArea();
		
		assertTrue("Error in cuboid sureface area Negative", actual==expected);
	}
	
	// Make sure positive numbers work with volume
	@Test
	public void cuboidVolumePositive() {

		Cuboid cuboid = new Cuboid(10, 10, 10);
		float expected = 1000.00f;
		
		float actual = cuboid.volume();

		assertTrue("Error in the cuboid volume Positive", actual==expected);
	}
	
	// Make sure the zeros will work with volume
	@Test
	public void cuboidVolumeZero() {

		Cuboid cuboid = new Cuboid(0, 0, 0);
		float expected = 0.0f;

		float actual = cuboid.volume();
		
		assertTrue("Erroe in the cuboid volume Zero", actual==expected);
	}
	
	// Test to see make sure negative number won't work
	@Test
	public void cuboidVolumeNegative() {
		
		Cuboid cuboid = new Cuboid(-10, -10, -10);
		float expected = 0.0f;

		float actual = cuboid.volume();
		
		assertTrue("Error in the cuboid volume Negative", actual==expected);
	}
	
	@Test(expected = Exception.class)
	public void expectedException() throws Exception {
		throw new Exception();
	}

}
