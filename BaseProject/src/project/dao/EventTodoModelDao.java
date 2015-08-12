package project.dao;

import java.util.List;

import org.slim3.datastore.DaoBase;
import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;

import project.model.EventTodoModel;

public class EventTodoModelDao extends DaoBase<EventTodoModel>{
    Datastore db;
    /**
     * Gets a list of event todos containing the string s
     * @param s the string reference
     * @return list of event todos
     */
    public List<EventTodoModel> getAllEventTodoContaining(String s){
        return null;
    }
    /**
     * Gets a list of all event todos
     * @return all event todos
     */
    public List<EventTodoModel> getAllEventTodo(){
        Transaction trans = Datastore.beginTransaction();
        List<EventTodoModel> list = (List<EventTodoModel>) Datastore.query(EventTodoModel.class).asList();
        trans.commit();
        return list;
    }
    /**
     * Gets a list of all event todos in a specific sort order
     * @param sortOrder the sort order of event todos
     * @return list of sorted event todos 
     */
    public List<EventTodoModel> getAllEvent(String sortOrder){
        return null;
    }
    /**
     * Adds an Event todo in the Datastore
     * @param et the event todo added
     * @return whether transaction is successful
     */
    public boolean addEventTodo(EventTodoModel et){
        boolean ok = false;
        Transaction trans = Datastore.beginTransaction();
        Key key = Datastore.createKey(EventTodoModel.class, et.getEventTitle());
        et.setKey(key);
        Datastore.put(et);
        trans.commit();
        ok = true;
        return ok;
    }
    /**
     * Removes an Event todo in the the Datastore
     * @param key the key of the event to be removed
     * @return whether the transaction is successful
     */
    public boolean removeEventTodo(Key key){
        boolean ok = false;
        Transaction trans = Datastore.beginTransaction();
        Datastore.delete(key);
        trans.commit();
        ok = true;
        return ok;
    }
    /**
     * Updates an Event todo in the Datastore
     * @param et the Event todo to be updated
     * @return whether the transaction is successful
     */
    public boolean updateEventTodo(EventTodoModel et){
        boolean ok = false;
        Transaction  trans = Datastore.beginTransaction();
        Datastore.put(et);
        trans.commit();
        ok = true;
        return ok;
    }
}
