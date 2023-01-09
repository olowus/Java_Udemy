public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Zoro");
        employee.sayHello("Luffy");

        employee = new Manager("Zoro");
        employee.sayHello("Nami");

        employee = new VicePresident("Zoro");
        employee.sayHello("Usopp");

        sayHello(new Employee("Robin"));
        sayHello(new Manager("Sanji"));
        sayHello(new VicePresident("Brook"));

    }

    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            System.out.println("Hello VP "+employee.name);
        }else if(employee instanceof Manager){
            System.out.println("Hello Manager "+employee.name);
        }else{
            System.out.println("Hello "+employee.name);
        }
    }
}
