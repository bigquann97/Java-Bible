public class AbstractClass {
    public static void main(String[] args) {

    }
}

abstract class Player {
    boolean pause;
    int currentPos;

    Player() {
        pause = false;
        currentPos = 0;
    }
    abstract void play(int pos);
    abstract void stop();

    void play() {
        play(currentPos);
    }

    void pause() {
        if(pause) {
            pause = false;
            play(currentPos);
        } else {
            pause = true;
            stop();
        }

    }
}

class Mp3Player extends Player {

    @Override
    void play(int pos) {

    }

    @Override
    void stop() {

    }
}