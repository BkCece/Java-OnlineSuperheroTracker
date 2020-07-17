package ca.cmpt213.a3.onlinesuperherotracker.model;

//Class for holding superhero information
//Most of the superhero code comes from Assignment 1: SuperheroTracker
public class Superhero {
    //Needed for spring
    private long id;

    //Superhero information
    private String name;
    private String superpower;
    private double heightCM;
    private int numCiviliansSaved;

    //Superhero constructor
    public Superhero(String name, String superpower, double heightCM, int numCiviliansSaved) {
        this.name = name;
        this.superpower = superpower;
        this.heightCM = heightCM;
        this.numCiviliansSaved = numCiviliansSaved;
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public double getHeightCM() {
        return heightCM;
    }

    public void setHeightCM(double heightCM) {
        this.heightCM = heightCM;
    }

    public int getNumCiviliansSaved() {
        return numCiviliansSaved;
    }

    public void setNumCiviliansSaved(int numCiviliansSaved) {
        this.numCiviliansSaved = numCiviliansSaved;
    }


    //To String for viewing superhero information
    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", superpower='" + superpower + '\'' +
                ", heightCM=" + heightCM +
                ", numCiviliansSaved=" + numCiviliansSaved +
                '}';
    }
}
