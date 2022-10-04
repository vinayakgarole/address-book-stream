package com.bridgelabz;

public class Contacts {
    /**
     * private variables can only be accessed within the same class (an outside class has no access to it)
     * private = restricted access
     * However, it is possible to access them if we provide public get and set methods.
     */

    private String firstName, lastName, address, city, state, email;
    private int zip;
    private long phoneNumber;
    /**
     * Used getter and setter to set and get the value.
     * Setter is used to set the value
     * Getter is used to get the value
     */

    /**
     * crete a get method name as getFirstName
     * The get method returns the value of the variable
     * @return firstName
     */
    public String getFirstName () {
        return firstName;
    }

    /**
     * The set method takes a parameter (firstName) and assigns it to the firstName variable
     * @param firstName
     */
    public void setFirstName (String firstName){
        /**
         *  The this keyword is used to refer to the current object.
         */
        this.firstName = firstName;
    }

    /**
     * crete a get method name as getLastName
     * The get method returns the value of the variable
     * @return lastName
     */
    public String getLastName () {
        return lastName;
    }

    /**
     * The set method takes a parameter (lastName) and assigns it to the lastName variable
     * @param lastName
     */
    public void setLastName (String lastName){
        /**
         *  The this keyword is used to refer to the current object.
         */
        this.lastName = lastName;
    }

    /**
     * crete a get method name as getAddress
     * The get method returns the value of the variable
     * @return address
     */
    public String getAddress () {
        return address;
    }

    /**
     * The set method takes a parameter (address) and assigns it to the address variable
     * @param address
     */
    public void setAddress (String address){
        /**
         *  The this keyword is used to refer to the current object.
         */
        this.address = address;
    }

    /**
     * crete a get method name as getCity
     * The get method returns the value of the variable
     * @return city
     */
    public String getCity () {
        return city;
    }

    /**
     * The set method takes a parameter (city) and assigns it to the city variable
     * @param city
     */
    public void setCity (String city){
        /**
         *  The this keyword is used to refer to the current object.
         */
        this.city = city;
    }

    /**
     * crete a get method name as getState
     * The get method returns the value of the variable
     * @return state
     */
    public String getState () {
        return state;
    }

    /**
     * The set method takes a parameter (state) and assigns it to the state variable
     * @param state
     */
    public void setState (String state){
        /**
         *  The this keyword is used to refer to the current object.
         */
        this.state = state;
    }

    /**
     * crete a get method name as getEmail
     * The get method returns the value of the variable
     * @return email
     */
    public String getEmail () {
        return email;
    }

    /**
     * The set method takes a parameter (email) and assigns it to the email variable
     * @param email
     */
    public void setEmail (String email){
        /**
         *  The this keyword is used to refer to the current object.
         */
        this.email = email;
    }

    /**
     * crete a get method name as getZip
     * The get method returns the value of the variable
     * @return zip
     */
    public int getZip () {
        return zip;
    }

    /**
     * The set method takes a parameter (zip) and assigns it to the zip variable
     * @param zip
     */
    public void setZip ( int zip){
        /**
         *  The this keyword is used to refer to the current object.
         */
        this.zip = zip;
    }

    /**
     * crete a get method name as getPhoneNumber
     * The get method returns the value of the variable
     * @return phoneNumber
     */
    public long getPhoneNumber () {
        return phoneNumber;
    }

    /**
     * The set method takes a parameter (phoneNumber) and assigns it to the phoneNumber variable
     * @param phoneNumber
     */
    public void setPhoneNumber ( long phoneNumber){
        /**
         *  The this keyword is used to refer to the current object.
         */
        this.phoneNumber = phoneNumber;
    }

    /**
     * overriding the toString() method
     * @return firstname , lastName,Address,Zip,City,State,email,phone number.
     *
     */
    public String toString () {
        return ("First name: " + firstName + "\n Last name: " + lastName + "\n Address: " + address + "\n city: " + city
                + "\n state: " + state + "\n email: " + email + "\n zip: " + zip + "\n phone number:" + phoneNumber + "");
    }
}