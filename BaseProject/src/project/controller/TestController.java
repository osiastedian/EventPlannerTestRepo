package project.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class TestController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return this.forward("/project/test.html");
    }
}
