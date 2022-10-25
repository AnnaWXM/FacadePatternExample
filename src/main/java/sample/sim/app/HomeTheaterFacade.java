package sample.sim.app;

public class HomeTheaterFacade {
    Amplifier amp;

    public HomeTheaterFacade(Amplifier amp){
        this.amp=amp;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        amp.on();


    }
    public void endMovie() {
        amp.off();
    }

    }
