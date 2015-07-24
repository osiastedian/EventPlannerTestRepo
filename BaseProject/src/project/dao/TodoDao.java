package project.dao;

import java.util.List;

import org.slim3.datastore.Datastore;

import project.model.Todo;

public class TodoDao {
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
    public List<Todo> getAllTodoContaining(String s)
    {
        return null;
        
    }
    /**
     * Gets all todos (default ascending order).
     * 
     * @return List of todos.
     */
    public List<Todo> getAllTodos()
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
    public List<Todo> getAllTodos(String sortOrder)
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
    public boolean addTodo(Todo todo)
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
    public boolean removeTodo(Todo todo)
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
    public boolean updateTodo(Todo todo)
    {
        return false;
    }
}
