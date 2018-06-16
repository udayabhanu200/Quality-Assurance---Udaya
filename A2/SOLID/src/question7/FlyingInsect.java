package question7;

public class FlyingInsect implements FlyingTypeInsectsInterface
{
	// this is concrete Flying Type of insect class : all  flying type of insects can implement "FlyingTypeInsectsInterface"
	
	/*public void Swim() // forced to implement earlier, but as interfaces are segregated swim() no more needed 
	{
		// I can't swim I fly!
	}*/

	public void Fly()
	{
		System.out.println("Flap flap!");
	}

	public void MoveAntennae()
	{
		System.out.println("Moving my antennae in the air!");
	}
}