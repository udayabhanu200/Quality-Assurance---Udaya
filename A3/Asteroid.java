import java.util.ArrayList;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.ListIterator;
// Asteroid is a leaf component in the composite structure
public class Asteroid extends BoardComponent//Asteroid is the Concrete Subject while BoardComponet acts as the Abstract Subject
											//
											//  BoardComponet also acts as "Abstract Observer" for both Shield and Square which are concrete Observer classes
{
	private int height;

	private final ArrayList<BoardComponent> children;
	public Asteroid(int height)
	{
		super();
		this.height = height;
		children = new ArrayList<BoardComponent>();

	}
	
	@Override
	public void Operation()// notify()
	{
		// The operation performed by Asteroid objects is to fall from the sky
		// one level at a time, when they hit the ground (height == 0) they impact
		// and destroy whatever buildings are in the square!
		height -= 1;
		if (0 == height)
		{
			// When an Asteroid impacts the ground it needs to send an event to the
			// observer to tell it that it impacted the ground in the square it belongs
			// to.
			// <-- Send event to observer.

			ArrayList<BoardComponent> childrenCopy = new ArrayList<BoardComponent>(children);
			for (int i = 0; i < childrenCopy.size(); i++)
			{
				BoardComponent child = childrenCopy.get(i);
				child.Operation();
			}

			//update()
			// It should then remove itself from its parent, it no longer exists in the
			// hierarchy and should not receive any more operations.
			parent.Remove(this);
		}
	}

	@Override
	public void Add(BoardComponent child)// observers instances
	{
		// I'm a leaf!
		children.add(child);
		child.SetParent(this);
	}

	@Override
	public void Remove(BoardComponent child)
	{
		children.remove(child);


	}	
}