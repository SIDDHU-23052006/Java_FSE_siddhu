interface Playable {
    void play();
}

class Football implements Playable {
    public void play() {
        System.out.println("Playing Football");
    }
}

public class InterfaceImplementation {
    public static void main(String[] args) {
        Football f = new Football();
        f.play();
    }
}