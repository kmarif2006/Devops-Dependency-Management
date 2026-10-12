package com.exmaple;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest{
    @Test
    void test(){
        App app=new App();
        assertEquals("Arif", app.getName());
    }
}