package project.service;
import java.util.List;

import project.dao.TodoDao;
import project.dto.TodoDto;
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
    public List<TodoModel> getAllTodos()
    {
        return null;
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
        return false;
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
        
        return false;
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
        return false;
    }
    
}
