package person;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private char sex;

    public Person(String firstName, String lastName, int age, char sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    //Dodaj do klasy Person metodę void introduce(), która powinna wyświetlić na konsoli informacje o osobie.
    // Przeiteruj przez zbiór osób z pkt. 3, aby na każdym elemencie wywołać metodę introduce.


    public void introduce() {
        System.out.println(String.format(firstName + " " + lastName + " Wiek: " + age + " Płeć: " + sex));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format(firstName + " " + lastName + " Wiek: " + age + " Płeć: " + sex);
    }
}
