public class SpawnShieldCommand extends Command {


    public SpawnShieldCommand(Object receiver, String[] args){

        super(receiver,args);
    }
    @Override
    public void Execute(){
        // The receiver for the SpawnShieldCommand is the Square to protect.
        Square square = (Square) receiver;
        // The args for SpawnShieldCommand are the X,Y coordinate for the shield where the a square exists

        IAsteroidGameFactory factory = GameBoard.Instance().GetFactory();
        System.out.println("Spawning shield at (" + args[0] + "," + args[1] + ")");
        square.Add(factory.MakeShield());



    }










}
