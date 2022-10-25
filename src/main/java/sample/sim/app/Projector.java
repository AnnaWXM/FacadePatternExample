package sample.sim.app;

public class Projector {
    StreamingPlayer player;
    String description;

    public Projector(String description, StreamingPlayer player){
        this.description = description;
        this.player = player;

    }
    public void on(){
        System.out.println("Turning ON "+description);
    }
    public void off(){
        System.out.println("Turning OFF "+ description);
    }
    public void tvMode(){
        System.out.println("Set "+description +" TV mode");
    }
    public void wideScreenMode(){
        System.out.println("Test Projector WideScreenMode ");
    }
    public String toString() {
        return description;
    }
}
