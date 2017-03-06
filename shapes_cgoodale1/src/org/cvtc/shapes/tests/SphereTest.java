package org.cvtc.shapes.tests;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class SphereTest {

	// Test the radius method of the sphere class
	@Test
	public void radiusOfSphere() {
		
		Sphere sphere = new Sphere(2.0f);
		float expected = 2.0f;
		
		float actual = sphere.getRadius();

		assertTrue("Error with sphere radius", actual==expected);
	}
	
	// Test that the constructor doesn't take negative numbers
	@Test
	public void contructorSphere() {
		
		Sphere sphere = new Sphere(-3.0f);
		float expected = 0.0f;
		
		float actual = sphere.getRadius();
		
		assertTrue("Error with sphere constructor", actual==expected);
	}
	
	// Tests that the surface area works with positive numbers
	@Test
	public void surfaceAreaOfSpherePositive() {
		
		Sphere sphere = new Sphere(2.0f);
		float expected = 50.265484f;
		
		float actual = sphere.surfaceArea();
		
		assertTrue("Error with sphere surface area Positive", actual==expected);
	}
	
	// Tests to prove that a negative number won't work with the surface area method
	@Test
	public void surfaceAreaOfSphereNegative() {
		
		Sphere sphere = new Sphere(-12.0f);
		float expected = 0.0f;
		
		float actual = sphere.surfaceArea();
		
		assertTrue("Error with sphere surface area Negative", actual==expected);
	}
	
	// Test that the surface area works with zeros
	@Test
	public void surfaceAreaOfSphereZero() {
		
		Sphere sphere = new Sphere(0.0f);
		float expected = 0.0f;
		
		float actual = sphere.surfaceArea();
		
		assertTrue("Error with sphere surface area Zero", actual==expected);
	}
	
	// Tests the volume works with positive numbers
	@Test
	public void volumeOfSpherePositive() {

		Sphere sphere = new Sphere(2.0f);
		float expected = 25.132742f;

		float actual = sphere.volume();
	
		assertTrue("Error with the volume of sphere Positive", actual==expected);
	}
	
	// Tests that volume doesn't work with negative numbers
	@Test
	public void volumeOfSphereNegative() {
		
		Sphere sphere = new Sphere(-122.0f);
		float expected = 0.0f;

		float actual = sphere.volume();

		assertTrue("Error with the volume of sphere Negative", actual==expected);
	}
	
	// Tests that volume works with zeros
	@Test
	public void volumeOfSphereZero() {

		Sphere sphere = new Sphere(0.0f);
		float expected = 0.0f;

		float actual = sphere.volume();

		assertTrue("Error with the volume of sphere Zero", actual==expected);
	}

	@Test(expected = Exception.class)
	public void expectedException() throws Exception {
		throw new Exception();
	}


}