public class Person {
    String name;
    String surname;
    String country;

    public Person(){
        this("Mazgi", "Mazgiyev");
        this.country = "Uzbekistan";
    }

    public Person(String name, String surname) {
//        this();
        this.name = name;
        this.surname = surname;
    }

    public void printDetail(){
        System.out.println(name + " " + surname + " " + country);
//        this.sayHello();
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}