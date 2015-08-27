package project.dao;

import java.util.List;

import org.slim3.datastore.DaoBase;
import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Transaction;
import com.google.appengine.api.datastore.Key;

import project.model.EventModel;

public class EventModelDao extends DaoBase<EventModel>{
    Datastore db;
    /**
     * Gets all events that contains String n in its title. <br> <br>
     * Ex.<br>
     * <br>
     *      "pa" -> (Party, Birthday Party and etc.)
     * @param s
     *            the string reference
     * @return List of todos.
     */
    public List<EventModel> getAllEventContaining(String s)
    {
        return null;

    }
    /**
     * Gets all Events (default ascending order).
     *
     * @return List of events.
     */
    public List<EventModel> getAllEvent()
    {
        Transaction trans = Datastore.beginTransaction();
        List<EventModel> list = (List<EventModel>) Datastore.query(EventModel.class).asList();
        trans.commit();
        return list;
    }
    /**
     * Gets all events with particular sorting order.
     * Ex. <br>
     *
     *     EventService es = new EventService(); <br>
     *     es.getAllEvent(EventService.SORT_ORDER_ASC); <br>
     * @param sortOrder
     *            the sortingOrder of the query
     * @return List of Events.
     */
    public EventModel getEvent(int id){
        EventModel model = new EventModel();
        model = Datastore.query(EventModel.class).filter("eventID", Query.FilterOperator.EQUAL, id).asSingle();
        return model;
    }
    public List<EventModel> getAllEvent(String sortOrder)
    {
        return null;
    }
    /**
     * Adds an Event object to the Datastore using EventDto.
     *
     * @param e
     *            the refernce to be added.
     * @return Whether transaction is succesful or not.
     */
    public boolean addEvent(EventModel e)
    {
        boolean ok = false;
        Transaction trans = Datastore.beginTransaction();
        Key key = Datastore.createKey(EventModel.class, e.getEventName());
        e.setKey(key);
        Datastore.put(e);
        trans.commit();
        ok = true;
        return ok;
    }
    /**
     * Removes an Event object in the Datastore using EventDto.
     *
     * @param e
     *            the refernce to be added.
     * @return Whether transaction is succesful or not.
     */
    public boolean removeEvent(Key key)
    {
        boolean ok = false;
        Transaction trans = Datastore.beginTransaction();
        Datastore.delete(key);
        trans.commit();
        ok = true;
        return ok;
    }
    /**
     * Updates an Event object in the Datastore using EventDto.
     *
     * @param e
     *            the refernce to be added.
     * @return Whether transaction is succesful or not.
     */
    public boolean updateEvent(EventModel e)
    {
        boolean ok = false;
        Transaction trans = Datastore.beginTransaction();
        Datastore.put(e);
        trans.commit();
        ok = true;
        return ok;
    }
}
