package model;

public class Person{
    private String name, address, city, phone;
    private int postalCode;
    public Person(String name, String address, int postalCode, String city, String phone){
        this.name=name;
        this.address=address;
        this.postalCode=postalCode;
        this.city=city;
        this.phone=phone;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getPostalCode(){
        return postalCode;
    }
    public String getCity(){
        return city;
    }
    public String getPhone(){
        return phone;
    }
}