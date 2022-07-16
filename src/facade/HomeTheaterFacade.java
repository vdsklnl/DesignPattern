package facade;

/**
 * @author vdsklnl
 * @create 2022-07-03 20:49
 * @Description
 */

public class HomeTheaterFacade {
    //定义各子系统对象
    private TheaterLight light;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Popcorn popcorn;
    private Stereo stereo;
    private Screen screen;

    public HomeTheaterFacade() {
        this.light = TheaterLight.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
        this.projector = Projector.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.screen = Screen.getIstance();
    }

    //操作分为四步
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        light.down();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcorn.off();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
        light.up();
    }

}
