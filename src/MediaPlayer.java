import java.util.List;
import java.util.ArrayList;
public class MediaPlayer {
    private static MediaPlayer instance;
    private PlaybackStrategy playbackStrategy;
    private VisualTheme visualTheme;
    private static List<MediaPlayerObserver> observers;

    private MediaPlayer() {
        observers = new ArrayList<>();
    }

    public static MediaPlayer getInstance() {
        if (instance == null) {
            instance = new MediaPlayer();
        }
        return instance;
    }


    public void setPlaybackStrategy(PlaybackStrategy playbackStrategy) {
        this.playbackStrategy = playbackStrategy;
    }

    public void play(List<String> playlist) {
        if (playbackStrategy instanceof ShufflePlaybackStrategy) {
            System.out.println("Using shuffle playback option");
        }
        playbackStrategy.play(playlist);
    }


    public void setVisualTheme(VisualTheme visualTheme) {
        this.visualTheme = visualTheme;
    }

    public void applyTheme() {
        visualTheme.applyTheme();
    }


    public static void addObserver(MediaPlayerObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(MediaPlayerObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String mediaItem) {
        for (MediaPlayerObserver observer : observers) {
            observer.update(mediaItem);
        }
    }

}
