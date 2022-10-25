package sample.sim.app;

public class Screen {
    String description;

    public Screen(String description){
        this.description = description;
    }
    public void up(){
        System.out.println(description+" going UP");
    }
    public void down(){
        System.out.println(description+" going DOWN");
    }
    public String toString(){
        return description;
    }

}
