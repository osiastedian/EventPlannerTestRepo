package project.dao;

import org.slim3.datastore.DaoBase;
import org.slim3.datastore.ModelMeta;
import org.slim3.datastore.ModelQuery;

import java.util.List;
import java.util.Map;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

import project.model.TodoModel;

public class TodoDao{
    Datastore db;
    /**
     * Gets all todos that contains String n in its title. <br> <br>
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
     * Gets all todos (default ascending order).
     * 
     * @return List of todos.
     */
    public List<TodoModel> getAllTodos()
    {
        return null;
    }
    /**
     * Gets all todos with particular sorting order. 
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
     * Adds a Todo object to the Datastore using TodoDto. 
     *
     * @param todo
     *            the refernce to be added.
     * @return Whether transaction is succesful or not.
     */
    public boolean addTodo(TodoModel todo)
    {
        return false;
    }
    /**
     * Removes a Todo object in the Datastore using TodoDto. 
     *
     * @param todo
     *            the refernce to be added.
     * @return Whether transaction is succesful or not.
     */
    public boolean removeTodo(TodoModel todo)
    {
        
        return false;
    }
    /**
     * Updates a Todo object in the Datastore using TodoDto. 
     *
     * @param todo
     *            the refernce to be added.
     * @return Whether transaction is succesful or not.
     */
    public boolean updateTodo(TodoModel todo)
    {
        return false;
    }
}
