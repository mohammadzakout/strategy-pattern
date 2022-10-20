
package authentication.after_strategy;


public interface RegisterUserStrategy {

 void excute();
    
}


class RegisterAdmin implements RegisterUserStrategy{



    @Override
    public void excute() {
        
        
// get input from user // 
// add values to field
// give all permissions
        
    }

}
class RegisterCustomer implements RegisterUserStrategy{




    @Override
    public void excute() {
        
// get input from user // 
// add values to field
// give some permissions 
// create a cart

        
    }

}


