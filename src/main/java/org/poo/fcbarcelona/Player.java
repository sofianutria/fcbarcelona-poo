package org.poo.fcbarcelona;

import org.poo.interfaces.MatchDay;
import org.poo.interfaces.MedicalService;

public class Player extends ClubMember implements MatchDay, MedicalService {
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

    //Al ser el método introduce abstracto en la clase ClubMember me obliga a
    // implementar el método introduce de la clase hija (player) (aunque ya lo había hecho
    //  antes, al igual que en staff)
    @Override
    public String introduce() {
        return "My full name is " + super.getName() + " " + super.getSurname()
                + ". I'm " + super.getAge() + " years old and I'm from " + super.getCountry()
                + ". I play as a " + this.position + " and my value is " + this.value;
    }

    // Creamos los métodos de los interfaces.
    @Override
    public void checkCallHour() {
        System.out.println("The call hour is 2 hours before the match");
    }

    @Override
    public void checkMaterial() {
        System.out.println("Please, don't forget to bring your cleats");
    }

    @Override
    public void checkMedicalTeam() {
        System.out.println("Your assigned medical team is: Dr. Martínez (physio) and Dra. Santos (dietitian)");
    }

    @Override
    public void checkNutritionPlan() {
        System.out.println("You have to eat pasta 4 hours before the match");
    }
}
