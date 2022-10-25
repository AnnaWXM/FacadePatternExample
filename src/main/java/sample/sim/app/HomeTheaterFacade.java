package sample.sim.app;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    Screen screen;
    Projector projector;
    TheaterLights lights;
    PopcornPopper popper;


    public HomeTheaterFacade(Amplifier amp,PopcornPopper popper, Projector projector, Screen screen, StreamingPlayer player, TheaterLights lights, Tuner tuner){
        this.amp=amp;
        this.tuner=tuner;
        this.player=player;
        this.screen=screen;
        this.projector=projector;
        this.lights=lights;
        this.popper=popper;

    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie.....");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStereoSound();
        amp.setStreamingPlayer(player);
        amp.setVolume(70);
        player.on();
        player.play("The interstellar");


    }
    public void endMovie() {
        System.out.println("Shutting down theater........");
        amp.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();

    }

    }
