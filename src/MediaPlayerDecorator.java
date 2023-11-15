public abstract class MediaPlayerDecorator implements VisualTheme {
    protected VisualTheme decoratedMediaPlayer;

    public MediaPlayerDecorator(VisualTheme decoratedMediaPlayer) {
        this.decoratedMediaPlayer = decoratedMediaPlayer;
    }

    @Override
    public void applyTheme() {
        decoratedMediaPlayer.applyTheme();
    }
}
