package authentication.after_strategy;


public class AuthenticationService {


    RegisterUserStrategy registerUserStrategy ;


public AuthenticationService(RegisterUserStrategy registerUserStrategy){
this.registerUserStrategy = registerUserStrategy;
}


void registerUser(){

registerUserStrategy.excute();

}

}



