package objects;

import geometry.Vector;
import main.Engine;

/**
 * Parent class for ALL graphical objects
 * @author jaydenlefebvre
 *
 */
public abstract class Renderable implements Engine{
	
	protected Vector pos;	//Specifies the top-left corner of an object's position on-screen
	
	protected Renderable(Vector pos) {
		this.pos = pos;
	}
	
	public double getX() {
		return pos.getX();
	}
	
	public double getY() {
		return pos.getY();
	}

	public Vector getPos() {
		return pos;
	}

}
