package programmer.expert.data;

public class SocialMedia {
}

class Instagram extends SocialMedia{
    final void login(){
        //isi method
    }
}

final class Facebook extends SocialMedia {}

//class FakeFacebook extends Facebook {}
// error karena tidak bisa inherit final class

class FakeInstagram extends Instagram{
//    ERROR karena tidak bisa meng-override final method
//    void login() {
//        super.login();
//    }
}
