package programmer.expert.application;

import programmer.expert.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("bankai", "rahasia");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Sanji"));
        System.out.println(new LoginRequest("Luffy","GomuGomu"));
    }
}
