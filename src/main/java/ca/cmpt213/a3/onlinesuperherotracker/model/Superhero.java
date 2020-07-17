package ca.cmpt213.a3.onlinesuperherotracker.model;

//Class for holding superhero information
//Most of the superhero code comes from Assignment 1: SuperheroTracker
public class Superhero {
    //Needed for spring
    private long id;

    //Superhero information
    private String name;
    private double heightInCm;
    private int civilianSaveCount;
    private String superPower;

    //Default construct?
    public Superhero(){

    }

    //Superhero constructor
    public Superhero(long id, String name, double heightInCm, int civilianSaveCount, String superPower) {
        this.id = id;
        this.name = name;
        this.heightInCm = heightInCm;
        this.civilianSaveCount = civilianSaveCount;
        this.superPower = superPower;
    }


    //Getters & Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(double heightInCm) {
        this.heightInCm = heightInCm;
    }

    public int getCivilianSaveCount() {
        return civilianSaveCount;
    }

    public void setCivilianSaveCount(int civilianSaveCount) {
        this.civilianSaveCount = civilianSaveCount;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }


    //To String for viewing superhero information

}
