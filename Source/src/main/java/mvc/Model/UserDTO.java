package mvc.Model;

import mvc.POJO.User;
import mvc.POJO.Users;
import mvc.POJO.helper.IdAdapter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class UserDTO {

    private static final String FILE_NAME = "C:\\Users\\vlad_\\Desktop\\UserSDGabrielM-sd2016_30434_marinescu_gabriel-b63c02c25026\\VladFloreaDS\\A2\\Source\\jaxb-users.xml";

    public void registerUserToXml(User user){
        Users users = new Users();
        users = readFromUserXml();
        users.addUser(user);

        writeToXml(users);
    }

    public User getUserForLogin(String userUsername){
        User u = new User();
        Users users;

        users = readFromUserXml();

        for(User user : users.getUsers()){
            if(userUsername.equals(user.getUsername())){
                u = user;
            }
        }

        return u;
    }

    public List<User> getUsersWithCriteria(String userCriteria){
        List<User> users = readFromUserXml().getUsers();
        List<User> usersWithCriteria = new ArrayList<>();

        for(User u : users){
            if(u.getUsername().toLowerCase().contains(userCriteria.toLowerCase())){
                usersWithCriteria.add(u);
            } else if(u.getName().toLowerCase().contains(userCriteria.toLowerCase())){
                usersWithCriteria.add(u);
            } else if(u.getUserType().toLowerCase().contains(userCriteria.toLowerCase())){
                usersWithCriteria.add(u);
            } else if("".equals(userCriteria) || "*".equals(userCriteria)){
                usersWithCriteria = users;
            }
        }

        return usersWithCriteria;
    }

    public void updateUser(User user){
        Users users = readFromUserXml();

        for(User u : users.getUsers()){
            if(u.getId().equals(user.getId())){
                users.getUsers().set(u.getId() - 1, user);
                writeToXml(users);
            }
        }
    }

    public void deleteUser(User user){
        Users users = readFromUserXml();

        users.getUsers().remove(user.getId() - 1);
        writeToXml(users);
    }


    private void writeToXml(Users users){

        try {
            JAXBContext context = JAXBContext.newInstance(Users.class);
            Marshaller m = context.createMarshaller();
            //for pretty-print XML in JAXB
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.setAdapter(new IdAdapter());
            // Write to System.out for debugging
            // m.marshal(emp, System.out);

            // Write to File
            m.marshal(users, new File(FILE_NAME));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private Users readFromUserXml(){
        Users users = new Users();

        try {
            JAXBContext context = JAXBContext.newInstance(Users.class);
            Unmarshaller un = context.createUnmarshaller();
            users = (Users) un.unmarshal(new File(FILE_NAME));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return users;
    }

}
