package project.controller.admin;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

/**
 * Admin/CRUD Screen Home controller.
 * @author Ted Ian Osias
 *
 */
public class IndexController extends Controller {

    @Override
    protected Navigation run() throws Exception {
        //return forward("crud.jsp");
        return forward("/project/login.html");
    }
}
