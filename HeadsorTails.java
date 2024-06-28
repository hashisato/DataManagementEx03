import java.util.Random;

public class HeadsorTails {
    public static void main(String[] args) {
        Random random = new Random();
        int he=0;
        int ta=0;
        int ar,br;
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
    }
}