public class UserNotificationObserver implements MediaPlayerObserver {
    @Override
    public void update(String mediaItem) {
        System.out.println("User notification: Now playing - " + mediaItem);
    }
}