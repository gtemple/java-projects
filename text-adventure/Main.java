import java.util.Scanner;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    Random rand = new Random();

    //Game Variables
    String[] enemies = {"Skeleton", "Zombie", "Jeff", "Dragon"};

    int maxEnemyHealth = 75;
    int enemyAttackDamage = 25;

    //Player varariables
    int health = 100;
    int attackDamage = 50;
    int numHealthPotions = 3;
    int healthPotionHealAmount = 30;
    int healthPotionDropChance = 50; //Percentage

    boolean running = true;

    System.out.println("Welcome to the Dungeon...");

    GAME:
    while (running) {
      System.out.println("----------------------");

      int enemyHealth = rand.nextInt(maxEnemyHealth);
      String enemy = enemies[rand.nextInt(enemies.length)];
      System.out.println("\t# " + enemy + " appeared! #\n");

      while(enemyHealth > 0) {
        System.out.println("\tYou HP: " + health);
        System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
        System.out.println("\n\tWhat would you like to do?");
        System.out.println("\t1. Attack");
        System.out.println("\t2. Drink potion");
        System.out.println("\t3. Run");

        String input = in.nextLine();
        
      }
    }
  }
}