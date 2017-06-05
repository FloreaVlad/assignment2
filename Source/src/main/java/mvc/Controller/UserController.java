package mvc.Controller;

import mvc.Model.UserDTO;
import mvc.POJO.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @RequestMapping(value = "/loginUser", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody User loginUser(@RequestBody User user){
        UserDTO userDTO = new UserDTO();
        User userXml = userDTO.getUserForLogin(user.getUsername());

        if(!user.getPassword().equals(userXml.getPassword())){
            userXml = null;
        }

        return userXml;
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody String registerUser(@RequestBody User user){
        user.setUserType("USER");
        UserDTO userDTO = new UserDTO();
        userDTO.registerUserToXml(user);

        return "";
    }

    @RequestMapping(value = "/registerUserOrAdmin", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody String registerUserOrAdmin(@RequestBody User user){
        UserDTO userDTO = new UserDTO();
        userDTO.registerUserToXml(user);

        return "";
    }

    @RequestMapping(value = "/searchUsers", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody List<User> searchUser(@RequestBody String userCriteria){
        UserDTO userDTO = new UserDTO();
        List<User> usersWithCriteria = userDTO.getUsersWithCriteria(userCriteria);

        return usersWithCriteria;
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody String updateUser(@RequestBody User user){
        UserDTO userDTO = new UserDTO();
        userDTO.updateUser(user);

        return "";
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody String deleteUser(@RequestBody User user){
        UserDTO userDTO = new UserDTO();
        userDTO.deleteUser(user);

        return "";
    }

}
