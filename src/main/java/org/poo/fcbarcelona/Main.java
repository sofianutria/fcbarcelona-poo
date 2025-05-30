package org.poo.fcbarcelona;

public class Main {
    public static void main (String[] args){
        //Prueba de la clase ClubMember, al convertir la clase abstract ya no podemos crear el objeto ClubMember.
        /*ClubMember trainer = new ClubMember("Hansi","Flick",60, "Germany");
        System.out.println(trainer.introduce());*/

        //Prueba de la clase Player
        Player lamine = new Player("Lamine Yamal", "Nasraoui", 17, "Spain", "Forward", 180000000);
        System.out.println(lamine.introduce());
        // El FC Barcelona gana la Champions League siendo Lamine el mejor jugador de la competición
        lamine.setValue(200000000);
        System.out.println("I'm " + lamine.getName() + " " + lamine.getSurname() + " the best player in the " +
                "world after winning the " + "Champions League, my value is " + lamine.getValue());
        //Utilizamos las interfaces
        lamine.checkCallHour();
        lamine.checkMaterial();
        lamine.checkMedicalTeam();
        lamine.checkNutritionPlan();


        //Prueba de la clase Staff
        Staff hansi = new Staff("Hansi","Flick",60,"Germany","trainer",3000000);
        System.out.println(hansi.introduce());
        //El FC Barcelona gana la Champions League y por las primas aumenta el salario de Hansi Flick
        hansi.setSalary(3500000);
        System.out.println("I'm " + hansi.getName() + " " + hansi.getSurname() +
                " and my new salary is " + hansi.getSalary());
        //Utilizamos las interfaces
        hansi.checkCallHour();
        hansi.checkMaterial();
    }
}
