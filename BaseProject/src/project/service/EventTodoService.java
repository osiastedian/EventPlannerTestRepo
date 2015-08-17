package project.service;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

import project.dao.EventTodoModelDao;
import project.dto.EventTodoDto;
import project.model.EventTodoModel;


public class EventTodoService {
    EventTodoModelDao dao = new EventTodoModelDao();
    
    public boolean addEventTodo(EventTodoDto et){
        EventTodoModel model = new EventTodoModel();
        model.setKey(et.getKey());
        model.setEventID(et.getEventID());
        model.setEventTitle(et.getEventTitle());
        model.setTodoId(et.getTodoId());
        model.setTodoStatus(et.getTodoStatus());
       
        return dao.addEventTodo(model);
    }
    public boolean removeEventTodo(EventTodoDto et){
        Key key = Datastore.createKey(EventTodoModel.class, et.getEventTitle());
        
        return dao.removeEventTodo(key);
    }
    public boolean updateEventTodo(EventTodoDto et){
        EventTodoModel model = new EventTodoModel();
        model.setEventID(et.getEventID());
        model.setEventTitle(et.getEventTitle());
        model.setTodoId(et.getTodoId());
        model.setTodoStatus(et.getTodoStatus());
        Key key = Datastore.createKey(EventTodoModel.class, et.getEventTitle());
        model.setKey(key);
        return dao.updateEventTodo(model);
    }
}
