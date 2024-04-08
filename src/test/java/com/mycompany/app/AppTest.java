package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage()+"123", app2.getMessage());
        
    }

    @Test
    public void testAppMessage()
    {
        App app = new App();
        assertEquals("Hello World222!", app.getMessage());
    }
    
    @Test
    public void testAppMessage1()
    {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }
}
