package project.controller.admin.event;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import project.dto.EventModelDto;
import project.service.EventService;

public class AddEventController extends Controller {

    @Override
    public Navigation run() throws Exception {
        EventService service = new EventService();
        EventModelDto dto = new EventModelDto();
        dto.setEventName("School!");
        dto.setEventID(2);
        dto.setDescription("Describes an event held by a particular school.");
        service.addEvent(dto);
        
        return null;
    }
}
