package project.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class ProfileController extends Controller {

    @Override
    protected Navigation run() throws Exception {
        // TODO Auto-generated method stub
        return this.forward("project/profile.html");
    }

}