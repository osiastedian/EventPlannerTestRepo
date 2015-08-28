package project.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class EventTodoModelTest extends AppEngineTestCase {

    private EventTodoModel model = new EventTodoModel();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
