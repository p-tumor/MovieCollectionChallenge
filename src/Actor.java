import java.util.ArrayList;
import java.util.Arrays;
public class Actor {
    private String name;
    private ArrayList<SimpleMovie> moviesActorIsIn;
    public Actor(){

    }
    public boolean compareActor(Actor otherActor){
        int smallerList = Math.min(this.moviesActorIsIn.size(), otherActor.moviesActorIsIn.size());
        for(int i = 0; i < smallerList; i++){

        }
        return false;
    }

    public int moviesStarredIn(SimpleMovie s){
        int count = 0;
        for(String name: s.getActors()) if (this.name.equals(name)) count++;
        return count;
    }

}
