package project.controller.admin.todo;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.repackaged.org.json.JSONObject;

import project.dto.TodoDto;
import project.service.TodoService;

public class RemoveTodoController extends Controller {

    int counter = 0;
    @Override
    public Navigation run() throws Exception {
        /*TodoService service = new TodoService();
        TodoDto todo = new TodoDto();
        todo.setTitle("Title"+counter);
        todo.setDescription("Description"+counter);
        todo.setFinished_quantity(counter);
        todo.setTotal_quantity(++counter);
        service.removeTodo(todo);
        return this.redirect("/");
        */
        System.out.println((String)this.requestScope("data"));
        TodoService service = new TodoService();
        JSONObject json = new JSONObject();
        TodoDto todo = new TodoDto();
        
        try {
            json = new JSONObject((String)this.requestScope("data"));
            todo.setTitle(json.getString("title"));
            todo.setDescription(json.getString("description"));
            todo.setFinished_quantity(json.getInt("finished_quantity"));
            //todo.setKey((Key)json.get("key"));
            todo.setId(json.getInt("id"));
            todo.setTotal_quantity(json.getInt("total_quantity"));
            service.removeTodo(todo);
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
