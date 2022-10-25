package sample.sim.app;

public class StreamingPlayer {
    Amplifier amplifier;
    String description;
    String movie;
    public StreamingPlayer(String description, Amplifier amplifier){
        this.description =description;
        this.amplifier=amplifier;
    }
    public void on(){
        System.out.println("Turning ON StreamingPlayer");
    }
    public void off(){
        System.out.println("Turning OFF StreamingPlayer");
    }
    public void setSurroundAudio(){
        System.out.println(description + " set surround audio");
    }
    public void play(String movie){
        System.out.println(description+" playing /" + movie +"/");
    }
    public void stop(){
        System.out.println("Movie Stopped!!!!");
    }
    public void setTwoChannelAudio(){
        System.out.println(description + " set two channel audio");
    }
    public void pause(){
        System.out.println(description + " paused \"" + movie + "\"");
    }

    public String toString(){
return description;
    }
}
