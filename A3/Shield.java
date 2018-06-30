import java.util.ArrayList;

public class Shield extends BoardComponent  { // Shield is the concrete decorator  assuming already BoardComponent serves as the Abstract Decorator

    private int shieldHealth;                 // for Abstract decorator there exists different Concrete Decorators , here Shield.java
                                            // every concrete decorator adds new operation(methods) OR new State (member variables) to the
                                            // here new state "shieldHealth" is added


    public Shield()// the state         // in observer pattern "BoardComponent" can act as the Observer Interface
        {
        super();
        shieldHealth =2;
    }


    @Override
    public void Operation()// this method can be used as the UPDATE , as we consider "BoardComponent" as the observer interface
    {/*
        for (int i = health.size();i>=0; --i)
        {
            BoardComponent child = health.get(i);
            child.Operation();
        }*/
        shieldHealth=shieldHealth-1;


        if(shieldHealth==0){

            parent.Remove(this);



        }

    }

    @Override
    public void Add(BoardComponent child)
    {
        // I am now this child's parent.
      /*  health.add(child);
        child.SetParent(this); */
    }

    @Override
    public void Remove(BoardComponent child)
    {
        /*health.remove(child);*/
    }








}
