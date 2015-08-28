package project.controller.admin.todo;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.repackaged.org.json.JSONObject;

import project.dto.TodoDto;
import project.service.TodoService;

public class GetTodoController extends Controller {

    @Override
    public Navigation run() throws Exception {
        
        JSONObject json = new JSONObject();
        TodoDto todo = null;
        try {
            
            TodoService service = new TodoService();
            todo = new TodoDto();
            todo.setTitle("TitleTest0");
            todo = service.getTodoByTitle(todo);
        } catch (Exception e) {
            e.printStackTrace();
            todo.getErrorList().add("Server controller error: " + e.getMessage());
        }
        json.put("todo", todo.toJSON());
        json.put("errorList", todo.getErrorList());
        response.setContentType("application/json");
        response.getWriter().write(json.toString());
        return null;
    }
}
