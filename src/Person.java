public class Person {
    String name;
    String surname;
    String country;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.country = "Uzbekistan";
    }

    public void printDetail(){
        System.out.println(name + " " + surname + " " + country);
        this.sayHello();
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}