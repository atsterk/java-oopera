import java.util.Objects;

public class Actor extends Person {
    private double height;

    Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + "(" + height + "м)";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(getName(), otherActor.getName()) &&
                Objects.equals(getSurname(), otherActor.getSurname())
                && (height == otherActor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }

    public double getHeight() {
        return height;
    }
}
