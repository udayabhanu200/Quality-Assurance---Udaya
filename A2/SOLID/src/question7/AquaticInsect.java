package question7;

public class AquaticInsect implements AquaticTypeInsectsInterface
{
	public void Swim()
	{
		System.out.println("Sploosh!");
	}
/*
	public void Fly() // this is concrete Aquatic Type of insect class : all  Aquatic type of insects can implement "AquaticTypeInsectsInterface"
	{
		// I can't fly I swim!
	}
*/
	public void MoveAntennae()
	{
		System.out.println("Moving my antennae underwater!");
	}
}