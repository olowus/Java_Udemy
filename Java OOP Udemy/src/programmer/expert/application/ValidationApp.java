package programmer.expert.application;

import programmer.expert.data.LoginRequest;
import programmer.expert.error.ValidationException;
import programmer.expert.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("asd", "kosong");

        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        }catch (ValidationException e){
            System.out.println("Data tidak valid : " + e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Data null : " + e.getMessage());
        }finally {
            System.out.println("Selalu di eksekusi");
        }

        System.out.println("=======Runtime Exception=======");
        // kelebihan runtime tidak perlu try catch
        // kekurangannya tanpa try catch jika ada error, maka apps akan langsung berhenti
        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        // cek apakah apps mati?
        System.out.println("Sukses Login");
    }
}
