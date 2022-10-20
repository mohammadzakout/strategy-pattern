package authentication.after_strategy;

public class Client {
   
    public static void main(String[] args) {
        
AuthenticationService service = new AuthenticationService(new RegisterAdmin());
service.registerUser();



    }






}
