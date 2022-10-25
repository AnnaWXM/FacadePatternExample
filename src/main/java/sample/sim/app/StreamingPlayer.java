package sample.sim.app;

public class StreamingPlayer {
    Amplifier amplifier;
    String description;
    public void on(){
        System.out.println("Turning ON StreamingPlayer");
    }
    public void off(){
        System.out.println("Turning OFF StreamingPlayer");
    }
    public void setSurroundAudio(){
        System.out.println("Set StreamingPlayer setSurroundAudio");
    }
    public void stop(){
        System.out.println("Turning OFF StreamingPlayer");
    }
    public void setTwoChannelAudio(){
        System.out.println("Set StreamingPlayer setTwoChannelAudio");
    }
    public void pause(){
        System.out.println("Dimming Theater lights");
    }
    public void play(){
        System.out.println("Dimming Theater lights");
    }
    public String toString(){
return description;
    }
}
