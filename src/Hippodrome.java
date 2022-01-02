import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    public static Hippodrome game;
    private static List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }
    public static void main(String[] args) {

        horses = new ArrayList<Horse>();

        Horse first = new Horse("First", 3, 0);
        Horse second = new Horse("Second", 3, 0);
        Horse third = new Horse("Third", 3, 0);

        horses.add(first);
        horses.add(second);
        horses.add(third);

        game = new Hippodrome(horses);

        game.run();

    }
    public void run(){
        for(int i=1; i<100; i++){
            move();
            print();
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
    public void move(){

        for(Horse horse:horses)
            horse.move();
    }
    public void print(){
        for(Horse horse:horses)
            horse.print();
        for(int i=0; i<10; i++)
        System.out.println();

    }
}
