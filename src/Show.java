import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

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
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Такой актер уже участвует в данном спектакле!");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актер успешно добавлен в список!");
        }
    }

    //Реализация, при которой заменяется первое найденное вхождение
    /* public void replaceActor(Actor newActor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актера с такой фамилией нет в списке!");
    }*/

    //Реализация с заменой всех актеров с данной фамилией
    public void replaceActor(Actor newActor, String surname) {
        int numberOfRemovedActors = 0;
        for (int i = listOfActors.size() - 1; i > 0; i--) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.remove(i);
                numberOfRemovedActors += 1;
            }
        }
        if (numberOfRemovedActors != 0) {
            listOfActors.add(newActor);
        } else {
            System.out.println("Актера с такой фамилией нет в списке!");
        }
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }
}
