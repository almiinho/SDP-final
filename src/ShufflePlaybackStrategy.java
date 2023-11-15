import java.util.ArrayList;
import java.util.List;
public class ShufflePlaybackStrategy implements PlaybackStrategy {
    @Override
    public void play(List<String> playlist) {
        System.out.println("Shuffle playback: " + shuffle(playlist));
    }

    private List<String> shuffle(List<String> playlist) {
        List<String> shuffledPlaylist = new ArrayList<>(playlist);
        java.util.Collections.reverse(shuffledPlaylist);
        return shuffledPlaylist;
    }
}