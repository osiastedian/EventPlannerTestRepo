package project.controller.admin;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;

import project.controller.admin.todo.GetTodoController;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GetTodoControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/admin/getTodo");
        GetTodoController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is(nullValue()));
    }
}
