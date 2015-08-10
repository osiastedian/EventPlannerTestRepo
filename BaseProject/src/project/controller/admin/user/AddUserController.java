package project.controller.admin.user;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import project.dto.UserDto;
import project.model.UserModel;
import project.service.UserService;

public class AddUserController extends Controller {
    
    UserModel um = new UserModel();
    
    @Override
    protected Navigation run() throws Exception {
        // TODO Auto-generated method stub
        UserService service = new UserService();
        UserDto user = new UserDto();
        user.setAddress(um.getAddress());
        user.setAge(um.getAge());
        user.setBirthday(um.getBirthday());
        user.setEmail(um.getEmail());
        user.setImgSrc(um.getImgSrc());
        user.setKey(um.getKey());
        user.setName(um.getName());
        //user.setVersion(um.getVersion())
        service.addUserModel(user);
        return null;
    }

}
