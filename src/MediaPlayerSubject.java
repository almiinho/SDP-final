import java.util.ArrayList;
import java.util.List;
public class MediaPlayerSubject {
    private final List<MediaPlayerObserver> observers = new ArrayList<>();

    public void addObserver(MediaPlayerObserver observer) {
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