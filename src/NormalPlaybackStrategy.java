import java.util.ArrayList;
import java.util.List;
public class NormalPlaybackStrategy implements PlaybackStrategy {
    @Override
    public void play(List<String> playlist) {
        System.out.println("Normal playback: " + playlist);
    }
}