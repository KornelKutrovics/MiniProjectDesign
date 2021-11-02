package model;
import java.util.ArrayList;
public class PersonContainer{
    private static PersonContainer instance = new PersonContainer();
    private ArrayList<Person> people;
    private PersonContainer(){
        people = new ArrayList<>();
    }
    public static PersonContainer getInstance() {
        return instance;
    }
    public boolean addPerson(Person person){
        return (person!=null) ? people.add(person):false;
    }
    public Person findPersonByName(String name){
        for(Person list:people){
            if(list.getName()==name){
                return list;
            }
        }
        return null;
    }
    public void printAll(){
        for(Person list:people){
            System.out.print(list.getName()+"   ");
            System.out.print(list.getAddress()+"   ");
            System.out.print(list.getPostalCode()+"   ");
            System.out.print(list.getCity()+"   ");
            System.out.println(list.getPhone()+"   ");
        }
    }
}
