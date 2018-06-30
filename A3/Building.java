// Building is the leaf node for the composite pattern, Square's can have MULTIPLE Buildings
// Buildings cannot have children.
public class Building extends BoardComponent
{
	private int buildingHealth;

	public Building()// in observer pattern "BoardComponent" can act as the Observer Interface
	{
		super();
		buildingHealth = 2;
	}

	@Override
	public void Operation()// this method can be used as the UPDATE , as we consider "BoardComponent" as the observer interface
	{
		// Buildings just stand there, they don't do anything.

		buildingHealth=buildingHealth-1;
		if(buildingHealth==0) {
			GameBoard.Instance().DecrementBuildingCount();
			parent.Remove(this);

		}
	}

	@Override
	public void Add(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	@Override
	public void Remove(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}



}

