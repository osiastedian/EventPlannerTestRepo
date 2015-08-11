package project.controller.admin.user;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
//import org.slim3.datastore.Datastore;
import org.slim3.repackaged.org.json.JSONObject;

//import com.google.appengine.api.datastore.Key;

//import project.dto.TodoDto;
import project.dto.UserDto;
//import project.model.UserModel;
//import project.service.TodoService;
import project.service.UserService;

public class GetUserController extends Controller {


    @Override
    protected Navigation run() throws Exception {
        // TODO Auto-generated method stub
        JSONObject json = new JSONObject();
        UserDto user = null;
        try {
            
            UserService service = new UserService();
            user = new UserDto();
            user.setName("Noville");
            user = service.getUsermodel(user);
        } catch (Exception e) {
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
