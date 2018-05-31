
package MessengerTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

import java.util.Date;

import messenger.Messenger;
import messenger.User;

/**
 *
 * @author Jose Fernando Lopez Fernandez
 */

public class MessengerTest {
    
    public static void main(String[] args) {
        try {
            File newFile = new File("./test-file.txt");
            
            if (newFile.createNewFile()) {
                System.out.println("Success!");
                
                Date currentDate = new Date();
                
                try {
                    FileOutputStream outputStream = new FileOutputStream(newFile);
                
                    byte[] message = "Current Date: ".getBytes();
                    
                    outputStream.write(message);
                    outputStream.write(currentDate.toString().getBytes());
                
                    outputStream.close();
                } catch (IOException outputIOException) {
                    outputIOException.printStackTrace();
                }
            } else {
                System.out.println("Error - File already exists!");
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
