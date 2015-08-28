package project.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;

import project.service.EventService;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class EventServiceTest extends AppEngineTestCase {

    private EventService model = new EventService();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
