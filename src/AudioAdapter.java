public class AudioAdapter implements AudioPlayer {
    private Mp3Player mp3Player;

    public AudioAdapter(Mp3Player mp3Player) {
        this.mp3Player = mp3Player;
    }

    @Override
    public void playAudio(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            mp3Player.playAudio(audioType, fileName);
        } else {
            System.out.println("Unsupported audio type: " + audioType);
        }
    }
}