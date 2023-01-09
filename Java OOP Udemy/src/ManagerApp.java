public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Luffy");
        manager.sayHello("Zoro");

        VicePresident vp = new VicePresident("Sanji");
        vp.sayHello("Zoro");
    }
}
