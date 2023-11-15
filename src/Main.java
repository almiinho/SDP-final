import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        MediaPlayer mediaPlayer = MediaPlayer.getInstance();// Singleton

        // Strategy Pattern
        PlaybackStrategy normalPlayback = new NormalPlaybackStrategy();
        PlaybackStrategy shufflePlayback = new ShufflePlaybackStrategy();
        mediaPlayer.setPlaybackStrategy(normalPlayback);

        // Decorator Pattern
        VisualTheme darkTheme = new DarkTheme();
        VisualTheme blueDarkTheme = new DarkThemeDecorator(darkTheme);
        mediaPlayer.setVisualTheme(blueDarkTheme);

        // Adapter Pattern
        Mp3Player mp3Player = new Mp3Player();
        AudioPlayer audioAdapter = new AudioAdapter(mp3Player);

        // Observer Pattern
        MediaPlayerObserver userNotificationObserver = new UserNotificationObserver();
        MediaPlayer.addObserver(userNotificationObserver);

        // Factory Pattern
        MediaItemFactory audioFactory = new AudioFactory();

        // Example usage
        List<String> playlist = Arrays.asList("Billie Jean.mp3", "A Day In The Life.mp3", "Suspicious Minds.mp3");
        mediaPlayer.play(playlist);
        mediaPlayer.setPlaybackStrategy(shufflePlayback);

        mediaPlayer.applyTheme();

        audioAdapter.playAudio("mp3", "My Heart Will Go On.mp3");
        audioAdapter.playAudio("mp4", "Bohemian Rhapsody.mp4");

        MediaItem audioItem = audioFactory.createMediaItem("audio", "My Heart Will Go On");
        // Observer notification
        mediaPlayer.notifyObservers(audioItem.getTitle());

        scanner.close();
    }
}
