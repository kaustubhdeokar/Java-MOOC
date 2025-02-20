package strategy.mediaplayer;

public class Media {
    private IPlayer player;
    public Media(IPlayer IPlayer) {
        this.player = IPlayer;
    }
    void playMedia(){
        player.play();
    }

}
