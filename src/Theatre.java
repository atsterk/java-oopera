import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Иванов", Person.Gender.MALE, 1.80);
        Actor actor2 = new Actor("Анастасия", "Сергеевна", Person.Gender.FEMALE, 1.70);
        Actor actor3 = new Actor("Андрей", "Андреев", Person.Gender.MALE, 1.75);

        Director director1 = new Director("Александр", "Петров", Person.Gender.FEMALE, 2);
        Director director2 = new Director("Джон", "Круз", Person.Gender.MALE, 1);

        Person musicAuthor = new Person("Папа", "Карло", Person.Gender.FEMALE);
        Person choreographer = new Person("Йцуке", "Фывап", Person.Gender.MALE);

        Show show = new Show("Ромео и Джульетта", 120, director1, new ArrayList<>());
        Opera opera = new Opera("Богема", 180, director1, new ArrayList<>(),
                musicAuthor, "12345", 2);
        Ballet ballet = new Ballet("Лебединое озеро", 240, director2, new ArrayList<>(),
                musicAuthor, "67890", choreographer);

        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        show.printAllActors();
        opera.printAllActors();
        ballet.printAllActors();

        show.replaceActor(actor3, "Иванов");
        show.printAllActors();

        opera.replaceActor(actor1, "Ооооо");

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
