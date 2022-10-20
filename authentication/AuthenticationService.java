
package authentication;


// before strategy 

public class AuthenticationService{

void registerUser(String userType){

if (userType.equals("admin")  ){

// String username = "";
// String password = "";

// System.out.println("registering admin");
// take input from user 
// give accesss to all system 
/// send Admin request To DB


} else if (userType.equals("customer")){

    // String email = "";
    // String password = "";
    // String phone = "";
    // String dob = "";

  // take input from user 

    System.out.println("registering customer");
/// save user 
// etc

}

}


public static void main(String[] args) {
  AuthenticationService as = new AuthenticationService();

    as.registerUser("admin");
}

}



