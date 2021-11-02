package controller;
import model.*;
public class PersonController {
       
    public Person createPerson(String name, String address, int postalCode, String city, String phone) {
    
        Person p = new Person(name, address, postalCode, city, phone);
        boolean result = PersonContainer.getInstance().addPerson(p);        
        return (result) ? p : null;

    }   
    public Person findPersonByName(String name){
        PersonContainer pc=PersonContainer.getInstance();
        return pc.findPersonByName(name);
    }
    public void printAll(){
        PersonContainer pc=PersonContainer.getInstance();
        pc.printAll();
    }
}