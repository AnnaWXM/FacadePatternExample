package sample.sim.app;

public class TheaterLights {
    String description;

    public TheaterLights(String description){
        this.description=description;
    }
    public void on(){
        System.out.println("Turning ON "+description);
    }
    public void off(){
        System.out.println("Turning OFF "+description);
    }
    public void dim(int level){
        System.out.println("Dimming "+description +" to level "+level);
    }

}
