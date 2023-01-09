package programmer.expert.data;

public record LoginRequest(String username, String password) {

    public LoginRequest{
        System.out.println("Mengakses object LoginRequest");
    }

    public LoginRequest(String username){
        this(username,"");
    };
    public LoginRequest(){
        this("","");
    };
}
