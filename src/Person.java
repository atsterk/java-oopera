public class Person {
    private String name;
    private String surname;
    private Gender gender;

    Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public enum Gender {
        MALE,
        FEMALE
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }
}
