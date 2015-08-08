package project.service;

import java.util.List;

import project.dao.EventModelDao;
import project.dto.EventModelDto;
import project.model.EventModel;

public class EventService {
    /**
     *  Ascending order of EventService transactions.
     */
    public static final String SORT_ORDER_ASC = "asc";
    /**
     *  Descending order of EventService transactions.
     */
    public static final String SORT_ORDER_DESC = "desc";
    /**
     *  Database Access Object assigned to EventService.
     */
    private EventModelDao dao = new EventModelDao();
    /**
         * Gets all events that contains String n in its title. <br> <br>
         * Ex.<br>
         * <br>
         *      "pa" -> (Party, Birthday Party and etc.)
         * @param s
         *            the string reference
         * @return List of events.
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
            return null;
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
        public boolean addEvent(EventModelDto e)
        {
            EventModel model = new EventModel();
            model.setKey(e.getKey());
           // model.setTitle(e.getTitle());
            model.setVersion(e.getVersion());
            return dao.addEvent(model);
        }
        /**
         * Removes an Event object in the Datastore using EventDto.
         *
         * @param e
         *            the refernce to be added.
         * @return Whether transaction is succesful or not.
         */
        public boolean removeEvent(EventModel e)
        {

            return false;
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
            return false;
    }
}
