public class Mp3Player implements AudioPlayer {
    @Override
    public void playAudio(String audioType, String fileName) {
        System.out.println("Playing Mp3 file: " + fileName);
    }
}