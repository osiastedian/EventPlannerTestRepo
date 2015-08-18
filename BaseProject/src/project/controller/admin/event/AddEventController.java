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
        dto.setEventName("Japanese Today");
        dto.setEventID(4);
        dto.setDescription("Konnichiwa!");
        service.addEvent(dto);
        return null;
    }
}
