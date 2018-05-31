
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package messenger;

/**
 *
 * @author Jose Fernando Lopez Fernandez
 */

public final class User {
    private String firstName;
    private String middleName;
    private String lastName;
    
    /** @fn User()
     *  
     *  @brief The default constructor is disabled because it doesn't make sense
     *  to create a user without a name.
     * 
     *  @returns void
     *  
     */
    
    private User() { }
    
    /** @fn User(String fName, String lName)
     *  
     *  @brief If a User is created with only two names, the middle name is
     *  assumed to be blank, and the first and last names are set respectively.
     * 
     *  @returns void
     *  
     */
    
    public User(String fName, String lName) {
        this.firstName  = fName;
        this.middleName = "";
        this.lastName   = lName;
    }
    
    /** @fn User(String fName, String mName, String lName)
     *  
     *  @brief This constructor takes as arguments all three names.
     * 
     *  @returns void
     * 
     */
    
    public User(String fName, String mName, String lName) {
        this.firstName  = fName;
        this.middleName = mName;
        this.lastName   = lName;
    }
    
    /** @fn toString()
     * 
     *  @param void
     * 
     *  @brief Returns a String representation of the User's name, composed of
     *  their first, middle, and last name respectively, with a space in
     *  between each name.
     * 
     *  @return String 
     * 
     */
    
    @Override
    public final String toString() {
        if (this.middleName == "") {
            return (this.firstName + " " + this.lastName);
        } else {
            return (this.firstName + " " + this.middleName + " " + this.lastName);
        }
    }
}
