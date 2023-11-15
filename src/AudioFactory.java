public class AudioFactory implements MediaItemFactory {
    @Override
    public MediaItem createMediaItem(String type, String title) {
        return new AudioItem(type, title);
    }
}