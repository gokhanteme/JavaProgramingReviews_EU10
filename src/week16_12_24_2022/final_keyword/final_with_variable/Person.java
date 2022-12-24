package week16_12_24_2022.final_keyword.final_with_variable;

public class Person {

    private String name;
    final private String BIRTHDAY;

    public Person(String name, String BIRTHDAY) {
        this.name = name;
        this.BIRTHDAY = BIRTHDAY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return BIRTHDAY;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", BIRTHDAY='" + BIRTHDAY + '\'' +
                '}';
    }
}
