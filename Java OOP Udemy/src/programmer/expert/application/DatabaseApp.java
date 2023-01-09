package programmer.expert.application;

import programmer.expert.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        // Error tidak direkomendasikan untuk di try catch, karena Error menandakan bahwa ada error yang critical
        connectDatabase("null", "rahasia");
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password){
        if(username == null | password == null){
            throw new DatabaseError("Tidak dapat konek ke Database");
        }
    }
}
