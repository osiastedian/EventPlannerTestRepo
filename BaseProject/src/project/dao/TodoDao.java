package project.dao;


import java.util.List;


import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;

import project.meta.TodoModelMeta;
import project.model.TodoModel;

public class TodoDao{
    /**
     * Gets all todos that contains String n in its title. <br> <br>
     * Ex.<br>
     * <br>
     *      "ma" -> (Make ballpen, Marinate Chicken, and etc.)
     * @param s
     *            the string reference
     * @return List of todos.
     */
    public String getTodoByTitle(String title)
    {
        String json = null;
        TodoModel model= null;
        model = Datastore.get(TodoModel.class, Datastore.createKey(TodoModel.class, title));
        TodoModelMeta tm = new TodoModelMeta();
        json = tm.modelToJson(model);
        return json;
        
    }
    /**
     * Gets all todos (default ascending order).
     * 
     * @return List of todos.
     */
    public List<TodoModel> getAllTodos()
    {
       Transaction trans = Datastore.beginTransaction();
        List<TodoModel> list = (List<TodoModel>) Datastore.query(TodoModel.class).asList();
        trans.commit();
        return list;
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
        boolean ok = false;
        Transaction trans = Datastore.beginTransaction();
        Key key = Datastore.createKey(TodoModel.class, todo.getTitle());
        todo.setKey(key);
        Datastore.put(todo);
        trans.commit();
        ok = true;
        return ok;
    }
    /**
     * Removes a Todo object in the Datastore using TodoModel. 
     *
     * @param todo
     *            the refernce to be added.
     * @return Whether transaction is succesful or not.
     */
    public boolean removeTodo(Key key)
    {
        boolean ok = false;
        Transaction trans = Datastore.beginTransaction();
        Datastore.delete(key);
        trans.commit();
        ok = true;
        return ok;
    }
    /**
     * Updates a Todo object in the Datastore using TodoModel. 
     *
     * @param todo
     *            the refernce to be added.
     * @return Whether transaction is succesful or not.
     */
    public boolean updateTodo(TodoModel todo)
    {
        boolean ok = false;
        Transaction trans = Datastore.beginTransaction();
        Datastore.put(todo);
        trans.commit();
        ok = true;
        return ok;
    }
}
