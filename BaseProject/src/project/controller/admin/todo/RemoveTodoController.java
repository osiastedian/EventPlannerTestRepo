package project.controller.admin.todo;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import project.dto.TodoDto;
import project.service.TodoService;

public class RemoveTodoController extends Controller {

    int counter = 0;
    @Override
    public Navigation run() throws Exception {
        TodoService service = new TodoService();
        TodoDto todo = new TodoDto();
        todo.setTitle("Title"+counter);
        todo.setDescription("Description"+counter);
        todo.setFinished_quantity(counter);
        todo.setTotal_quantity(++counter);
        service.removeTodo(todo);
        return this.redirect("/");
    }
}
