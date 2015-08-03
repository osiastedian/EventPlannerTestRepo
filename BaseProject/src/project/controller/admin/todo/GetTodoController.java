package project.controller.admin.todo;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import project.service.TodoService;

public class GetTodoController extends Controller {

    @Override
    public Navigation run() throws Exception {
        TodoService service = new TodoService();
        String json = service.getTodoJsonByTitle("Title0");
        System.out.println(json);
        return this.redirect("/");
    }
}
