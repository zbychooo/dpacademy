package edu.dpacademy.adapter;

/**
 * This is dpacademy. Good Luck!
 */
public class AdapterWrapperTrial
{
    public static void main(String args[]) {

        MediaPlayer mp3 = new Mp3Player();
        mp3.play("Adele");

        MediaPlayer mp4 = new FormatAdapter(new Mp4Player());
        mp4.play("Adele");

        MediaPlayer vlc = new FormatAdapter(new VlcPlayer());
        vlc.play("Adele");
    }
}

interface MediaPlayer{
    void play(String filename);
}

class Mp3Player implements MediaPlayer {
    public void play(String filename) {
        System.out.println("i am playing mp3 " + filename);
    }
}

interface MediaPackage{
    void playFile(String filename);
}

class Mp4Player implements MediaPackage {
    public void playFile(String filename) {
        System.out.println("i a playing mp4 " + filename);
    }
}

class VlcPlayer implements MediaPackage {
    public void playFile(String filename) {
        System.out.println("i am playing vlc " + filename);
    }
}

class FormatAdapter implements MediaPlayer {

    MediaPackage mediaPackage;

    public FormatAdapter(MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    public void play(String filename) {
        mediaPackage.playFile(filename);
    }
}