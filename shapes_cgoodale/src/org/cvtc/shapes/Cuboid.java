package org.cvtc.shapes;

/**
 * @author Connor
 *
 */
public class Cuboid extends Shape{
	
	/**
	 * The width of the Cuboid
	 */
	private float width = 0.0f;
	
	/**
	 * The height of the Cuboid
	 */
	private float height = 0.0f;
	
	/**
	 * The depth of the Cuboid
	 */
	private float depth = 0.0f;
	
	/**
	 * Gets the width of the Cuboid
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * Sets the width of the Cuboid
	 */
	private void setWidth(float width) {
		this.width = width;
	}

	/**
	 * Gets the height of the Cuboid
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * Sets the height of the Cuboid
	 */
	private void setHeight(float height) {
		this.height = height;
	}

	/**
	 * Gets the depth of the Cuboid
	 */
	public float getDepth() {
		return depth;
	}

	/**
	 * Sets the depth of the Cuboid
	 */
	private void setDepth(float depth) {
		this.depth = depth;
	}

	/**
	 * @param width
	 * @param height
	 * @param depth
	 */
	public Cuboid(Dialog dialog, float width, float height, float depth) {
		super(dialog);
		
		
		if (width >= 0){
			setWidth(width);
		}
		
		
		if (height >=0){
			setHeight(height);
		}
		
		
		if (depth >=0){
			setDepth(depth);
		}
	}

	
	@Override
	public float surfaceArea() {
		
		
		return 2.0f * ((getWidth()*getHeight()) + (getHeight()*getDepth()) + (getDepth()*getWidth()));
	}

	
	@Override
	public float volume() {
		
		
		return (getWidth() * getDepth() * getHeight());
	}

	
	@Override
	public String render() {
		
		return "Sureface Area: " + surfaceArea() + " \nVolume: " + volume();
	}
	
	
	
	
	

}
