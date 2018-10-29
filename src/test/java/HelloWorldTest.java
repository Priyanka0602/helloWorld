import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void shouldReturnHelloWorld(){
        HelloWorld helloWorld=new HelloWorld();
        assertEquals("Hello World",helloWorld.getHelloWorld());
    }
}
