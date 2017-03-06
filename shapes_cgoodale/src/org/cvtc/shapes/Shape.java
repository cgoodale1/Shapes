/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Connor
 */
public abstract class Shape {
	
	protected Dialog dialog;
	/**
	 * 
	 * Surface area method declaration 
	 */
	public abstract float surfaceArea();
	
	/**
	 * volume method declaration
	 */
	public abstract float volume();
	
	/**
	 * render method declaration
	 * @return 
	 */
	public abstract String render();
	
	public Dialog getDialog() {
		return dialog;
	}

	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public Shape(Dialog dialog) {
		setDialog(dialog);
	}

}
