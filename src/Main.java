public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alish", "Aliyev");
        System.out.println(person1.name + " " + person1.surname + " " + person1.country);

        Person person2 = new Person("Valish", "Valiyev");
        System.out.println(person2.name + " " + person2.surname + " " + person2.country);
    }
}
