package spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private String message;

    private int number;
  

    public HelloWorld(String message, int number) {
        this.message = message;
        this.number = number;
      
    }
    public HelloWorld() {
    	
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void getMessage() {
        System.out.println(this.message);
    }

    public void setNumber(int number) {
        this.number = number;
    }

  

    public void displayMessage() {
        System.out.println("Message: " + message);
        System.out.println("Number: " + number);
       
    }
}