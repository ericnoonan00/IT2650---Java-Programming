import java.util.Random;

public class Ghost {
    /*
        move, die, spawn, be vulnerable
     */
    Random rnd = new Random();

    private int x;
    private int y;
    private boolean vulnerable;
    private String color;

    public Ghost(String color){
        this.vulnerable = false;
        this.color = color;
        x = 6;
        y = 7;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void move(){
        while (this.vulnerable = false) {
            int d = rnd.nextInt(4);
            if (d == 0){
                this.x++;
            }else if (d == 1){
                this.x--;
            }else if (d == 2){
                this.y++;
            }else if (d == 3){
                this.y--;
            }
        }
    }

    public void respawn() {
        x = 6;
        y = 7;
    }

}
