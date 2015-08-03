package project.controller.admin.todo;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import project.model.TodoModel;
import project.service.TodoService;

public class GetAllTodosController extends Controller {

    @Override
    public Navigation run() throws Exception {
        TodoService service = new TodoService();
        System.out.println(service.getAllTodos());
        return this.redirect("/");
    }
}
