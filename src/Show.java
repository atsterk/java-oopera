import java.util.ArrayList;

public class Show {
    public String title;
    public int duration;
    public Director director;
    public ArrayList<Actor> listOfActors;

    Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }


}
