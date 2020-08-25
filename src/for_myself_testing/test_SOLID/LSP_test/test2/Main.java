package for_myself_testing.test_SOLID.LSP_test.test2;

public class Main {
    public static void main(String[] args) {
        YouTubeMusic youTubeMusic = new YouTubeMusic();
        SpotifyPlayer spotifyPlayer = new SpotifyPlayer();

        youTubeMusic.playVideo();
        youTubeMusic.playAudio();

        spotifyPlayer.playAudio();
    }
}
