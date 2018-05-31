
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 */

package Tests;

import messenger.User;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 *
 * @author Jose Fernando Lopez Fernandez
 * 
 */

public class MessengerUserTest {
    @Test
    public void testAssertNameEquals() {
        User testUser = new User("Jose Fernando", "Lopez Fernandez");
        
        byte[] expected = "Jose Fernando Lopez Fernandez".getBytes();
        byte[] actual   = testUser.toString().getBytes();
        
        assertArrayEquals("[Failure] - Names are not equal.", expected, actual);
    }
}
