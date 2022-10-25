package sample.sim.app;

public class RealFacade {
    public static void main(String[] args) {

        Amplifier amp = new Amplifier("Amplifier");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp);
        homeTheater.watchMovie("The interstellar");
    }
}
