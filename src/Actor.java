public class Actor extends Person{
    public double height;

    Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }
}
