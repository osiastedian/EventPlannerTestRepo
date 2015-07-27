package project.dao;

import org.slim3.datastore.DaoBase;
import org.slim3.datastore.ModelMeta;
import org.slim3.datastore.ModelQuery;

import java.util.List;
import java.util.Map;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

import project.model.Todo;

public class TodoDao extends DaoBase<Todo>{
    /* (non-Javadoc)
     * @see org.slim3.datastore.DaoBase#getModelClass()
     */
    @Override
    public Class<Todo> getModelClass() {
        // TODO Auto-generated method stub
        return super.getModelClass();
    }
    /* (non-Javadoc)
     * @see org.slim3.datastore.DaoBase#getModelMeta()
     */
    @Override
    public ModelMeta<Todo> getModelMeta() {
        // TODO Auto-generated method stub
        return super.getModelMeta();
    }
    /* (non-Javadoc)
     * @see org.slim3.datastore.DaoBase#get(com.google.appengine.api.datastore.Key)
     */
    @Override
    public Todo get(Key key) {
        // TODO Auto-generated method stub
        return super.get(key);
    }
    /* (non-Javadoc)
     * @see org.slim3.datastore.DaoBase#getOrNull(com.google.appengine.api.datastore.Key)
     */
    @Override
    public Todo getOrNull(Key key) {
        // TODO Auto-generated method stub
        return super.getOrNull(key);
    }
    /* (non-Javadoc)
     * @see org.slim3.datastore.DaoBase#exists(com.google.appengine.api.datastore.Key)
     */
    @Override
    public boolean exists(Key key) {
        // TODO Auto-generated method stub
        return super.exists(key);
    }
    /* (non-Javadoc)
     * @see org.slim3.datastore.DaoBase#get(java.util.List)
     */
    @Override
    public List<Todo> get(List<Key> keys) {
        // TODO Auto-generated method stub
        return super.get(keys);
    }
    /* (non-Javadoc)
     * @see org.slim3.datastore.DaoBase#getAsMap(java.util.List)
     */
    @Override
    public Map<Key, Todo> getAsMap(List<Key> keys) {
        // TODO Auto-generated method stub
        return super.getAsMap(keys);
    }
    /* (non-Javadoc)
     * @see org.slim3.datastore.DaoBase#put(java.lang.Object)
     */
    @Override
    public Key put(Todo model) {
        // TODO Auto-generated method stub
        return super.put(model);
    }
    /* (non-Javadoc)
     * @see org.slim3.datastore.DaoBase#put(java.util.List)
     */
    @Override
    public List<Key> put(List<Todo> models) {
        // TODO Auto-generated method stub
        return super.put(models);
    }
    /* (non-Javadoc)
     * @see org.slim3.datastore.DaoBase#delete(com.google.appengine.api.datastore.Key)
     */
    @Override
    public void delete(Key key) {
        // TODO Auto-generated method stub
        super.delete(key);
    }
    /* (non-Javadoc)
     * @see org.slim3.datastore.DaoBase#delete(java.util.List)
     */
    @Override
    public void delete(List<Key> keys) {
        // TODO Auto-generated method stub
        super.delete(keys);
    }
    /* (non-Javadoc)
     * @see org.slim3.datastore.DaoBase#query()
     */
    @Override
    protected ModelQuery<Todo> query() {
        // TODO Auto-generated method stub
        return super.query();
    }
    /* (non-Javadoc)
     * @see org.slim3.datastore.DaoBase#query(com.google.appengine.api.datastore.Key)
     */
    @Override
    protected ModelQuery<Todo> query(Key ancestorKey) {
        // TODO Auto-generated method stub
        return super.query(ancestorKey);
    }
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
