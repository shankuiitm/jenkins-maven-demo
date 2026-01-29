package demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testMessage() {
        assertEquals("Hello from Jenkins Maven CI/CD", App.message());
    }
}
