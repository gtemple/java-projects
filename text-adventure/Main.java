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
        if (input.equals("1")) {
          int damageDealt = rand.nextInt(attackDamage);
          int damageTaken = rand.nextInt(enemyAttackDamage);

          enemyHealth -= damageDealt;
          health -= damageTaken;
          System.out.print("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
          System.out.print("\t> You recieve " + damageTaken + " from " + enemy + ".");

          if (health < 1) {
            System.out.println("\t> You have taken too much damage, you died.");
            break;
          }

        } else if (input.equals("2")) {
          if(numHealthPotions > 0) {
            health += healthPotionHealAmount;
            numHealthPotions--;
            System.out.println("\t>You drink a health potion, healing yourself for " + healthPotionHealAmount + ".\n\t>You have " + health + " health.");
          } else {
            System.out.println("\t>You have no remaining health potions.");
          }
        } else if (input.equals("3")) {
          System.out.println("\t You run away from " + enemy);
          continue GAME;
        } else {
          System.out.println("\tInvalid command");
        }  
      }
      if(health < 1) {
        System.out.println("You black out and awake outside the dungeon.");
        break;
      }

      System.out.println("----------------------");
      System.out.println("  #  " + enemy + " was deffeated!  #  ");
      System.out.println("  #  You have " + health + " HP left.  #  ");


    }
  }
}