package project.controller.admin.user;

import java.util.Date;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.repackaged.org.json.JSONObject;

import project.dto.TodoDto;
import project.dto.UserDto;
import project.model.UserModel;
import project.service.TodoService;
import project.service.UserService;

public class RemoveUserController extends Controller {

    UserModel um = new UserModel();
    @Override
    protected Navigation run() throws Exception {
        // TODO Auto-generated method stub
        /*UserService service = new UserService();
        service.removeUserModel(um.getKey());
        return redirect("/");*/
        UserService service = new UserService();
        JSONObject json = new JSONObject();
        UserDto user = new UserDto();
        
        try{
            json = new JSONObject((String)this.requestScope("data"));
            user.setAddress(json.getString("address"));
            user.setAge(json.getInt("age"));
            //user.setBirthday(Date.parse(json.getString("date"));
            user.setEmail(json.getString("email"));
            //user.setKey(null);
            //user.setImgSrc(json.getString("imgSrc"));
            user.setName(json.getString("name"));
            service.removeUserModel(user);
            
        }catch(Exception e){
            e.printStackTrace();
            user.getErrorList().add("Server controller error: " + e.getMessage());
        }
        json.put("user", user.toJSON());
        json.put("errorList", user.getErrorList());
        response.setContentType("application/json");
        response.getWriter().write(json.toString());
        
        return null;
    }

}
