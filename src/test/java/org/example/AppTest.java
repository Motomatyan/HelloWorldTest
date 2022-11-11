package org.example;


import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class AppTest{

   @Test
    void stringIsCorrect() {
       App app = new App();

        Assertions.assertEquals("Hello World!","Hello World!" );

    }
}
