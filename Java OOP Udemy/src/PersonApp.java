public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Zoro", "Bandung");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Luffy");

        Person person2 = new Person("Luffy");
        Person person3;
        person3 = new Person();
        person3.name = "Dragon";
        person3.address = "Fuusha";
        person3.sayHello("Garp");
    }
}
