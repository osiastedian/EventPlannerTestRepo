package project.controller.admin.event;

import java.util.Map;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.repackaged.org.json.JSONObject;

import project.dto.EventModelDto;
import project.dto.TodoDto;
import project.service.EventService;
import project.service.TodoService;

public class GetController extends Controller {

    @Override
    public Navigation run() throws Exception {
        JSONObject json = new JSONObject();
        EventModelDto dto = null;
        String eventId = this.request.getParameter("eventId");
        try {
            dto = new EventModelDto();
            dto.setEventID(Integer.parseInt(eventId));
            EventService service = new EventService();
            dto = service.loadEventToDto(dto);
            
        } catch (Exception e) {
            e.printStackTrace();
            dto.getErrorList().add("Server controller error: " + e.getMessage());
        }
        json.put("event", dto.toJSON());
        json.put("errorList", dto.getErrorList());
        response.setContentType("application/json");
        response.getWriter().write(json.toString());
        return null;
    }
}
