package project.controller.admin.todo;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import project.dto.TodoDto;
import project.service.TodoService;

public class AddTodoController extends Controller {

    int counter = 1;
    @Override
    public Navigation run() throws Exception {
        TodoService service = new TodoService();
        TodoDto todo = new TodoDto();
        todo.setTitle("TitleTest"+counter);
        todo.setDescription("Description"+counter);
        todo.setFinished_quantity(counter);
        todo.setTotal_quantity(++counter);
        service.addTodo(todo);
        return redirect("/");
    }
}
