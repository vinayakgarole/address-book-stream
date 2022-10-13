package com.bridgelabz;

import java.util.*;
public class AddressBookMain {
    /**
     * create a main method all program execute in main method
     *
     * @param args no argument
     */
    public static void main(String[] args) {
        /**
         * create a scanner object
         */
        Scanner sc = new Scanner(System.in);
        /**
         * create a object for  AddressBookSystem class the object name as addressBook
         */
        AddressBookSystem addressBook = new AddressBookSystem();
        /**
         * create a object for map class object name is addressBookMap
         */
        Map<String, AddressBookSystem> addressBookMap = new HashMap<String, AddressBookSystem>();

        while (true) {
            /**
             * 1st display welcome msg
             * then display al the option
             */
            System.out.println("\nWelcome to Address Book System");
            System.out.println("1. New Address Book \n2. Select Address Book \n3. Delete Address Book \n4. Search Contact Data \n5. Exit");
            /**
             * choose the option what u want
             */
            System.out.print("Enter Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            /**
             * using switch case
             */
            switch (choice) {
                case 1:
                    System.out.println("Enter Name of new Address Book: ");
                    String bookName = sc.next();
                    sc.nextLine();
                    /**
                     * adding bookname as a key and value is allocating
                     * memory for addressbook object
                     */
                    addressBookMap.put(bookName, new AddressBookSystem());
                    /**
                     * call addressbookoption method with
                     * passing key of hashmap
                     */
                    AddressBookSystem.addressBookOptions(addressBookMap.get(bookName));
                    break;
                case 2:
                    System.out.println("List of available Address Book : ");
                    /**
                     * retrived keys from hashmap to show addressbooklist
                     */
                    Set<String> keys = addressBookMap.keySet();
                    Iterator<String> i = keys.iterator();
                    while (i.hasNext()) {
                        System.out.println(i.next());
                    }
                    System.out.println("Enter Address Book name you want to Open : ");
                    String name = sc.nextLine();
                    System.out.println("Current Address Book is : " + name);
                    /**
                     * call method with passing address book name
                     */
                    AddressBookSystem.addressBookOptions(addressBookMap.get(name));
                    break;
                case 3:
                    System.out.println("Enter Address Book name to be delete: ");
                    name = sc.nextLine();
                    /**
                     * delete hashmap using remove function
                     */
                    addressBookMap.remove(name);
                    break;
                case 4:
                    System.out.println("Welcome to the search option:");
                    addressBook.searchByOptions();
                case 5:
                    sc.close();// for closing the program
                    return;
                default:
                    System.out.println("You Entered Invalid Choice....!");
                    break;
            }
        }
    }
}