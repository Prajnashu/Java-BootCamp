import java.util.Random;

public class RandomInt {
    public static void main(String[] args) {
        Random rand = new Random();

    for(int i=0; i<30; i++) {
        if(i%6 == 0) 
            System.out.println();
        System.out.println(rand.nextInt(3000, 6000));
        }
    }
    
}
