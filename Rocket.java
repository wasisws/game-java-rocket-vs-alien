import greenfoot.*;

public class Rocket extends Actor {
    private static final int SPEED = 4;

    public void act() {
        checkKeyPress();
        peluru();
        if (isTouching(Alien1.class)) {
            removeTouching(Alien1.class);
            getWorld().removeObject(this);
            Greenfoot.playSound("gameOver.mp3");
            Greenfoot.setWorld(new LoseGame());
            Greenfoot.stop();
            PlayPage1.score.setValue(0);
        }
    }

    public void checkKeyPress() {
        if (Greenfoot.isKeyDown("right")) {
            move(5); // Menggerakkan aktor ke kanan dengan kecepatan 5
        }
        if (Greenfoot.isKeyDown("left")) {
            move(-5); // Menggerakkan aktor ke kiri dengan kecepatan 5
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 5); // Menggerakkan aktor ke atas dengan kecepatan 5
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 5); // Menggerakkan aktor ke bawah dengan kecepatan 5
        }
    }

    public void peluru() {
        if ("space".equals(Greenfoot.getKey())) {
            //Greenfoot.playSound("SuaraTembakan.wav");
            getWorld().addObject(new Peluru(), getX() + 50, getY());
            Greenfoot.playSound("piw.mp3");
        }
    }
}
