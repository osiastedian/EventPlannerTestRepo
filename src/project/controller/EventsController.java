package project.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class EventsController  extends Controller {

    @Override
    protected Navigation run() throws Exception {
        return forward("project/allEvents.html");
    }
}

