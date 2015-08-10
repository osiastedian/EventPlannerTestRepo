package project.controller.admin.todo;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;
import org.slim3.repackaged.org.json.JSONObject;

import com.google.appengine.api.datastore.Key;

import project.dto.TodoDto;
import project.model.TodoModel;
import project.service.TodoService;

public class UpdateTodoController extends Controller {

    @Override
    public Navigation run() throws Exception {
        /*TodoService service = new TodoService();
        TodoDto todo = new TodoDto();
        todo.setTitle("TitleTest0");
        todo.setKey(Datastore.createKey(TodoModel.class, todo.getTitle()));
        todo.setDescription("Edited Description");
        todo.setFinished_quantity(999);
        todo.setTotal_quantity(1000);
        todo.setId(123456);
        todo.setVersion((long)20);
        service.updateTodo(todo);
        return this.redirect("/");*/
        System.out.println((String)this.requestScope("data"));
        TodoService service = new TodoService();
        JSONObject json = new JSONObject();
        TodoDto todo = new TodoDto();
        
        try {
            json = new JSONObject((String)this.requestScope("data"));
            todo.setTitle(json.getString("title"));
            todo.setDescription(json.getString("description"));
            todo.setFinished_quantity(json.getInt("finished_quantity"));
            todo.setKey(Datastore.createKey(TodoModel.class, todo.getTitle()));
            todo.setId(json.getInt("id"));
            todo.setTotal_quantity(json.getInt("total_quantity"));
            service.updateTodo(todo);
        } catch (Exception e) {
            e.printStackTrace();
            todo.getErrorList().add("Server controller error: " + e.getMessage());
        }
        json.put("errorList", todo.getErrorList());
        response.setContentType("application/json");
        response.getWriter().write(json.toString());
        return null;
    }
}
