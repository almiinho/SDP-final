import java.util.ArrayList;
import java.util.List;
// Strategy Pattern
public interface PlaybackStrategy {
    void play(List<String> playlist);
}