package project.controller.admin.user;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import project.model.UserModel;
import project.service.UserService;

public class RemoveUserController extends Controller {

    UserModel um = new UserModel();
    @Override
    protected Navigation run() throws Exception {
        // TODO Auto-generated method stub
        UserService service = new UserService();
        service.removeUserModel(um.getKey());
        return redirect("/");
    }

}
