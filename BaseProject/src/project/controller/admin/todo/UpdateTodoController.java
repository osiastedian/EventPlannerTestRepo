package project.controller.admin.todo;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;

import project.dto.TodoDto;
import project.model.TodoModel;
import project.service.TodoService;

public class UpdateTodoController extends Controller {

    @Override
    public Navigation run() throws Exception {
        TodoService service = new TodoService();
        TodoDto todo = new TodoDto();
        todo.setTitle("TitleTest0");
        todo.setKey(Datastore.createKey(TodoModel.class, todo.getTitle()));
        todo.setDescription("Edited Description");
        todo.setFinished_quantity(999);
        todo.setTotal_quantity(1000);
        todo.setId(123456);
        todo.setVersion((long)20);
        service.updateTodo(todo);
        return this.redirect("/");
    }
}
