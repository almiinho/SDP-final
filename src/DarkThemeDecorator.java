public class DarkThemeDecorator extends MediaPlayerDecorator {
    public DarkThemeDecorator(VisualTheme decoratedMediaPlayer) {
        super(decoratedMediaPlayer);
    }

    @Override
    public void applyTheme() {
        super.applyTheme();
        System.out.println("Applying Dark Theme");
    }
}