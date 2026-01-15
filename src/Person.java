public class Person {
    String name;
    String surname;

    public Person(){
        System.out.println("Person Constructor");
    }

    public Person(String personName) {
        System.out.println(personName);
    }

    public Person(String personName, String personSurname) {
        System.out.println(personName + " " + personSurname);
    }
}