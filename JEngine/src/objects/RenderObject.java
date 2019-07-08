package objects;

import java.util.ArrayList;

import components.Component;
import geometry.Vector;
import main.Renderable;
import objects.RenderLayer.LayerID;

/**
 * Parent class for ALL graphical objects
 * @author jaydenlefebvre
 *
 */
public abstract class RenderObject implements Renderable{
	
	protected Vector pos;	//Specifies the top-left corner of an object's position on-screen
	protected ArrayList<Component> components = new ArrayList<Component>();		//List of attached components
	protected LayerID renderlayer;
	
	RenderObject(Vector pos, LayerID renderlayer) {
		this.pos = pos;
		this.renderlayer = renderlayer;
	}

	public Vector getPos() {
		return pos;
	}
	
	public void addComponent(Component c) {
		components.add(c);
	}
	
	public LayerID getLayerID() {
		return renderlayer;
	}
	
	public String toString() {
		return "Renderable Object";
	}

	public ArrayList<Component> getComponents() {
		// TODO Auto-generated method stub
		return components;
	}
	
	public void fupdateComponents() {
		for(Component c : components) {
			c.fixedUpdate();
		}
	}

}