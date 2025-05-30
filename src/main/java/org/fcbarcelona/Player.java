package org.fcbarcelona;

public class Player extends ClubMember {
    private String position;
    private int value;

    public Player(String name, String surname, int age, String country, String position, int value) {
        super(name, surname, age, country);
        this.position = position;
        this.value = value;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String introduce() {
        return "My full name is " + super.getName() + " " + super.getSurname()
                + ". I'm " + super.getAge() + " years old and I'm from " + super.getCountry()
                + ". I play as a " + this.position + " and my value is " + this.value;
    }
}
