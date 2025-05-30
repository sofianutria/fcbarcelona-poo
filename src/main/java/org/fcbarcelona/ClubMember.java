package org.fcbarcelona;

public abstract class ClubMember {
    private String name;
    private String surname;
    private int age;
    private String country;

    public ClubMember(String name, String surname, int age, String country) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public abstract String introduce();
    //Al convertir el método en abstract ya no se implementa
    /*{
        return "My full name is " + this.name + " " + this.surname
                + ". I'm " + this.age + " years old and I'm from " + this.country;
    }*/
}
