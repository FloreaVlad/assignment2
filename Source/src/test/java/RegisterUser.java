import mvc.Controller.UserController;
import mvc.POJO.User;

public class RegisterUser {

    public void testRegisterUser(){
        User user = new User();
        UserController userController = new UserController();

        user.setId(10);
        user.setUsername("Username@yahoo.ro");
    }

}
