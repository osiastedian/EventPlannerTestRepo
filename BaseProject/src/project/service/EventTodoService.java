package project.service;

import java.util.List;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

import project.dao.EventModelDao;
import project.dao.EventTodoModelDao;
import project.dao.TodoDao;
import project.dto.EventTodoDto;
import project.dto.TodoDto;
import project.model.EventModel;
import project.model.EventTodoModel;
import project.model.TodoModel;


public class EventTodoService {
    EventTodoModelDao dao = new EventTodoModelDao();
    
    public boolean addEventTodo(EventTodoDto et){
        EventTodoModel model = new EventTodoModel();
        model.setEventID(et.getEventID());
        model.setTodoId(et.getTodoId());
        model.setEventTitle((new EventModelDao()).getEvent(model.getEventID()).getEventName());
        TodoModel todo = (new TodoDao()).getTodoById(model.getTodoId());
        model.setTodoTitle(todo.getTitle());
        model.setTodoDescription(todo.getDescription());
        model.setTodoTotal_quantity(todo.getTotal_quantity());
        Key key = Datastore.createKey(EventTodoModel.class, model.getEventTitle() + model.getEventTitle());
        model.setKey(key);
        return dao.addEventTodo(model);
    }
    public boolean removeEventTodo(EventTodoDto et){
        Key key = Datastore.createKey(EventTodoModel.class, et.getEventTitle());
        return dao.removeEventTodo(key);
    }
    public boolean updateEventTodo(EventTodoDto et){
        EventTodoModel model = new EventTodoModel();
        model.setEventID(et.getEventID());
        model.setTodoId(et.getTodoId());
        model.setEventTitle((new EventModelDao()).getEvent(model.getEventID()).getEventName());
        TodoModel todo = (new TodoDao()).getTodoById(model.getTodoId());
        model.setTodoTitle(todo.getTitle());
        model.setTodoDescription(todo.getDescription());
        model.setTodoTotal_quantity(todo.getTotal_quantity());
        Key key = Datastore.createKey(EventTodoModel.class, et.getEventTitle() + et.getTodo().getTitle());
        model.setKey(key);
        return dao.updateEventTodo(model);
    }
    public List<TodoDto> getAllTodosByEventID(int eventId){
        
        return null;
    }
}
