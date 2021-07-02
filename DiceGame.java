import java.util.Random;
import java.util.Scanner;

class DiceGame{
    public static void main(String args[]){

	Random random = new Random();
	int dice1 = random.nextInt(6) + 1;
	int dice2 = random.nextInt(6) + 1;
	System.out.println("Rolling the dice...");
	System.out.println("Die 1: " + dice1);
	System.out.println("Die 2: " + dice2);
	System.out.println("Total value: " + (dice1 + dice2));
	if(dice1 + dice2 > 7) System.out.println("You won");
	else System.out.println(name+" lost");
    }
}
