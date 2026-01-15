public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alish", "Aliyev");
        System.out.println(person1);
        person1.printDetail();

        Person person2 = new Person("Valish", "Valiyev");
        System.out.println(person2);
        person2.printDetail();
    }
}
