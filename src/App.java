import processing.core.PApplet;

public class App extends PApplet {

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        size(500, 500);
        
    }

    public void setup() {
        background(0);
        frameRate(60);
    }

    public void draw() {
        
        background(0);
        
        fill(0,0,255);
        rect(100, 100,100,100);

    }
}