package project.dto;

import org.slim3.datastore.Attribute;
import org.slim3.repackaged.org.json.JSONException;
import org.slim3.repackaged.org.json.JSONObject;

import project.model.EventTodoModel;

import com.google.appengine.api.datastore.Key;

public class EventTodoDto {
    /**
     * Event ID container
     */
    private int eventID;
    /**
     * Event title container
     */
    private String eventTitle;
    /**
     * Todo Id associated with specific event
     */
    private int todoId = -1;
    /**
     *   Status of EventTodo.
     */
    private boolean todoStatus;
    
    /**
     * 
     * @return the event ID
     * 
     */
    public int getEventID(){
        return this.eventID;
    }
    /**
     * 
     * @param id the id to be set
     */
    public void setEventID(int id){
        this.eventID = id;
    }
    /**
     * 
     * @return the event title
     */
    public String getEventTitle(){
        return this.eventTitle;
    }
    /**
     * 
     * @param title the title to be set
     */
    public void setEventTitle(String title){
        this.eventTitle = title;
    }
    /**
     * @return the todoId
     */
    public int getTodoId() {
        return todoId;
    }
    /**
     * @param todoId the todoId to set
     */
    public void setTodoId(int todoId) {
        this.todoId = todoId;
    }

 
    public boolean getTodoStatus() {
        return todoStatus;
    }

    public void setTodoStatus(boolean todoStatus) {
        this.todoStatus = todoStatus;
    }
    
    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;

    /**
     * Returns the key.
     *
     * @return the key
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key
     *            the key
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * Returns the version.
     *
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version
     *            the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        EventTodoModel other = (EventTodoModel) obj;
        if (key == null) {
            if (other.getKey() != null) {
                return false;
            }
        } else if (!key.equals(other.getKey())) {
            return false;
        }
        return true;
    }
    public JSONObject toJSON() throws JSONException
    {
        JSONObject json = new JSONObject();
        json.put("key", this.getKey());
        json.put("eventID",this.getEventID());
        json.put("eventTitle", this.getEventTitle());
        json.put("todoId", this.getTodoId());
        return json;
    }
}
