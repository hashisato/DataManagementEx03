import java.util.Random;
import java.util.Scanner;

public class HeadsorTails {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int he=0;
        int ta=0;
        int ar,br;
        System.out.printf("Who are you?\n> ");
        String name = sc.next();
        sc.close();
        System.out.println("Hello, "+name+"!");
        System.out.println("Tossing a coin...");
        for(int i=1; i<=3; i++){
            System.out.printf("Round "+i+": ");
            ar=br=0;
            for(int j=0;j<5; j++){
                if(random.nextBoolean()){ ar++; }
                else{ br++; }
            }
            if(ar-br>0){
                System.out.println("Heads");
                he++;
            }
            else {
                System.out.println("Tails");
                ta++;
            }
        }
        System.out.println("Heads: "+he+", Tails: "+ta);
        if(he>ta){ System.out.println("You won"); }
        else{ System.out.println("You lost"); }
    }
}