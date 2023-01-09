public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Eren", "Jaeger");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello "+firstName+" "+lastName);
    }
}
