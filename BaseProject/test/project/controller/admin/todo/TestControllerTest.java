package project.controller.admin.todo;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;

import project.controller.TestController;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TestControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/admin/todo/test");
        TestController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is(nullValue()));
    }
}
