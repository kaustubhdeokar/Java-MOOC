package strategy.mediaplayer;

public class MainClass {

    public static void main(String[] args) {

        IPlayer video = new Video();
        Media media = new Media(video);
        media.playMedia();

        IPlayer audio = new Audio();
        media = new Media(audio);
        media.playMedia();

    }
}
