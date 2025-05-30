package org.fcbarcelona;

public class Staff extends ClubMember {
    private String job;
    private int salary;

    public Staff(String name, String surname, int age, String country, String job, int salary) {
        super(name, surname, age, country);
        this.job = job;
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String introduce() {
        return "My full name is " + super.getName() + " " + super.getSurname()
                + ". I'm " + super.getAge() + " years old and I'm from " + super.getCountry()
                + ". I work as a " + this.job + " and my salary is " + this.salary;
    }
}
