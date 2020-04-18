import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Dice {
    static void roll() {

        System.out.println("Enter roll to roll the dice");
        Scanner scan =new Scanner(System.in);
        String input =scan.nextLine();

        int previousRoll=-1;
        System.out.println("Previous is: "+previousRoll);
        try {

            if ("roll".equals(input)) {

                Random random = new Random();
                int answer = random.nextInt(6) + 1;

                System.out.println("Current is: "+answer);
                previousRoll=answer;
                System.out.println("Previous is: " +previousRoll);

                System.out.println("Current is: "+answer);
                previousRoll=answer;
                System.out.println("Previous is: " +previousRoll);

            } else {
                throw new NoSuchFieldException("enter roll to roll");
            }
        }catch (NoSuchFieldException e){
            System.out.println(e);
        }

    }
}
