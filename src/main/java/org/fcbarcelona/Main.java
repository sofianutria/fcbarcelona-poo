package org.fcbarcelona;

public class Main {
    public static void main (String[] args){
        ClubMember trainer = new ClubMember("Hansi","Flick",62, "Germany");
        System.out.println(trainer.introduce());
        Player lamine = new Player("Lamine Yamal", "Nasraoui", 17, "Spain", "Forward", 180000000);
        System.out.println(lamine.introduce());
        // El FC Barcelona gana la Champions League siendo Lamine el mejor jugador de la competición
        lamine.setValue(200000000);
        System.out.println("I'm " + lamine.getName() + " " + lamine.getSurname() + " the best player in the " +
                "world after winning the " + "Champions League, my value is " + lamine.getValue());
    }
}
