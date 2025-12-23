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

    public void printDirectorInfo() {
        System.out.println("Режиссёр этого спектакля: " + director);
    }

    public void printAllActors() {
        System.out.println("Список актеров, участвующих в спектакле: ");
        for(Actor actor: listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor newActor) {
        if(listOfActors.contains(newActor)) {
            System.out.println("Такой актер уже участвует в данном спектакле!");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актер успешно добавлен в список!");
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актера с такой фамилией нет в списке!");
    }
}
