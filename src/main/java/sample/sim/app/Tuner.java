package sample.sim.app;

public class Tuner {
    Amplifier amplifier;
    Double frequency;
    String description;
    public Tuner(String description, Amplifier amplifier){
        this.description=description;
    }
    public void on(){
        System.out.println("Turning ON "+description);
    }
    public void off(){
        System.out.println("Turning OFf "+description);
    }
    public void setAM(){
        System.out.println(description+" setting AM mode");
    }
    public void setFM(){
        System.out.println(description + " setting AM mode");    }
    public String toString(){
        return description;
    }
}
