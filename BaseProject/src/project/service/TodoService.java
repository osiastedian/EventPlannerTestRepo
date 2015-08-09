package project.service;
import java.util.List;

import org.slim3.datastore.Datastore;
import org.slim3.datastore.ModelListener;
import org.slim3.datastore.json.JsonWriter;
import org.slim3.datastore.json.ModelWriter;

import project.dao.TodoDao;
import project.dto.TodoDto;
import project.meta.TodoModelMeta;
import project.model.TodoModel;



public class TodoService {
    /**
     *  Ascending order of TodoService transactions.
     */
    public static final String SORT_ORDER_ASC = "asc";
    /**
     *  Descending order of TodoService transactions.
     */
    public static final String SORT_ORDER_DESC = "desc";
    /**
     *  Database Access Object assigned to TodoService.
     */
    private TodoDao dao = new TodoDao();
    /**
     * Gets all todos that contains String n in its title using TodoDao. <br> <br>
     * Ex.<br>
     * <br>
     *      "ma" -> (Make ballpen, Marinate Chicken, and etc.)
     * @param s
     *            the string reference
     * @return List of todos.
     */
    public List<TodoModel> getAllTodoContaining(String s)
    {
        return null;
        
    }
    /**
     * Gets all todos (default ascending order) using TodoDao.
     * 
     * @return List of todos.
     */
    public String getAllTodos()
    {
        List<TodoModel> models   = dao.getAllTodos();
        TodoModelMeta tm = new TodoModelMeta();
        return tm.modelsToJson(models);
    }
    public TodoDto getTodoByTitle(TodoDto todo)
    {
        TodoModel model =dao.getTodoByTitle(todo.getTitle());
        todo.setDescription(model.getDescription());
        todo.setKey(model.getKey());
        todo.setFinished_quantity(model.getFinished_quantity());
        todo.setId(model.getId());
        todo.setTotal_quantity(model.getTotal_quantity());
        todo.setVersion(model.getVersion());
        return todo;
        
    }
    /**
     * Gets all todos with particular sorting order using TodoDao. 
     * Ex. <br>
     * 
     *     TodoService ts = new TodoService(); <br>
     *     ts.getAllTodos(TodoService.SORT_ORDER_ASC); <br>
     * @param sortOrder
     *            the sortingOrder of the query
     * @return List of todos.
     */
    public List<TodoModel> getAllTodos(String sortOrder)
    {
        return null;
    }
    /**
     * Adds a Todo object to the Datastore using TodoDao with TodoDto. 
     *
     * @param todo
     *            the refernce to be added.
     * @return Whether transaction is succesful or not.
     */
    public boolean addTodo(TodoDto todo)
    {
        TodoModel model = new TodoModel();
        model.setKey(todo.getKey());
        model.setTitle(todo.getTitle());
        model.setDescription(todo.getDescription());
        model.setFinished_quantity(todo.getFinished_quantity());
        model.setTotal_quantity(todo.getTotal_quantity());
        return dao.addTodo(model);
    }
    /**
     * Removes a Todo object in the Datastore using TodoDao with TodoDto. 
     *
     * @param todo
     *            the refernce to be added.
     * @return Whether transaction is succesful or not.
     */
    public boolean removeTodo(TodoDto todo)
    {
        todo.setKey(Datastore.createKey(TodoModel.class, todo.getTitle()));
        return dao.removeTodo(todo.getKey());
    }
    /**
     * Updates a Todo object in the Datastore using TodoDao with TodoDto. 
     *
     * @param todo
     *            the refernce to be added.
     * @return Whether transaction is succesful or not.
     */
    public boolean updateTodo(TodoDto todo)
    {
        TodoModel model = new TodoModel();
        model.setKey(todo.getKey());
        model.setTitle(todo.getTitle());
        model.setTotal_quantity(todo.getTotal_quantity());
        model.setDescription(todo.getDescription());
        model.setVersion(todo.getVersion());
        model.setId(todo.getId());
        model.setFinished_quantity(todo.getFinished_quantity());
        dao.updateTodo(model);
        return false;
    }
    
}
