/**
 * This class prints the given message on console.
 */
package org.testng.MessageUtil;

public class MessageUtil {
    private String message;
    //Constructor
//@param message to be printed
    public MessageUtil(String message){
        this.message = message;
    }
    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
