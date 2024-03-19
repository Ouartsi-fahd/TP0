package org.example;

public class Person {
    private String First_Name;
    private String Last_Name ;
    private int Age ;

    public Person(String First_Name , String Last_Name , int Age ){
        this.First_Name = First_Name ;
        this.Last_Name = Last_Name ;
        this.Age = Age ;
    }

    public Boolean isAdult(){
        if (this.Age>=18) return true;
        return false ;
    }

    public String getFullName(){
            return this.First_Name.concat(" ").concat(Last_Name);

    }
    public int getAge() {
        return Age;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }
}
