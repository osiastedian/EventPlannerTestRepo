package project.controller.admin.event;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.repackaged.org.json.JSONObject;

import project.dto.EventModelDto;
import project.service.EventService;

public class UpdateController extends Controller {

    @Override
    public Navigation run() throws Exception {
        EventService service = new EventService();
        JSONObject json = new JSONObject();
        EventModelDto event = new EventModelDto();
        try{
            json = new JSONObject((String)this.requestScope("data"));
            event.setEventID(json.getInt("eventID"));
            event.setEventName(json.getString("eventName"));
            event.setDescription(json.getString("description"));
            service.updateEvent(event);
        }catch(Exception e){
            e.printStackTrace();
            event.getErrorList().add("Server Controller error: "+ e.getMessage());
        }
        json.put("event", event.toJSON());
        json.put("errorList", event.getErrorList());
        response.setContentType("application/json");
        response.getWriter().write(json.toString());
        return null;
    }
}
