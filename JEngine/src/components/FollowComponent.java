package components;

import geometry.Vector;
import objects.RenderObject;

/**
 * 
 * @author jaydenlefebvre
 *
 */
public abstract class FollowComponent extends Component {

	protected Vector pos, delta;

	/**
	 * Makes a zero-delta attached component
	 * @param parent
	 */
	public FollowComponent(RenderObject parent, boolean g) {
		this(parent, new Vector(0, 0), g);
	}

	/**
	 * Makes a component with a location that follows at a fixed delta
	 * @param parent
	 * @param delta
	 */
	public FollowComponent(RenderObject parent, Vector delta, boolean g) {
		super(g);
		this.delta = delta;
		this.pos = parent.getPos().add(delta);
	}

	public void followObject(RenderObject e) {
		this.pos = e.getPos().add(delta);
	}

}