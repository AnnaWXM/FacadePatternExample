package sample.sim.app;

public class MainClass {
    public static void main(String[] args) {

        Amplifier amp = new Amplifier("Amplifier");
        PopcornPopper popper =new PopcornPopper();
        StreamingPlayer player = new StreamingPlayer("Streaming player",amp);
        Projector projector =new Projector("Projector",player);
        Screen screen = new Screen(" Theater Screen");
        TheaterLights lights = new TheaterLights("Theater bulbs");
        Tuner tuner = new Tuner("Tuner FM",amp);



        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp,popper,projector,screen,player,lights,tuner);
        homeTheater.watchMovie("The interstellar");
        System.out.println("\n");
        homeTheater.endMovie();
    }
}
