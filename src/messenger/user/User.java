
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package messenger.user;

/**
 *
 * @author Jose Fernando Lopez Fernandez
 */

public final class User {
    private String firstName;
    private String middleName;
    private String lastName;
    
    @Override
    public String toString() {
        return (this.firstName + " " + this.middleName + " " + this.lastName);
    }
}
