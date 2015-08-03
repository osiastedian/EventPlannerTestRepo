package project.controller.admin;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;

import project.controller.admin.todo.AddTodoController;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class AddTodoControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/admin/addTodo");
        AddTodoController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is(nullValue()));
    }
}
