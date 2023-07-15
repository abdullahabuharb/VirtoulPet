// Virtual pet done by Abdullah Abuharb and Nour Abutaha
import java.util.Random;
import java.util.Scanner;

public class VirtualPetApplication extends VirtualPet {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    String petName;
    int userInput, userInput1;

    // creating Random number to use it for th obj att value
    Random random = new Random();
    int min = 5, max = 20;
    int randomNum1 = random.nextInt(max - min + 1) + min;
    int randomNum2 = random.nextInt(max - min + 1) + min;
    int randomNum3 = random.nextInt(max - min + 1) + min;
    int randomNum4 = random.nextInt(max - min + 1) + min;

    VirtualPet pet = new VirtualPet();
    pet.setHunger(randomNum1);
    pet.setThirst(randomNum2);
    pet.setBoredom(randomNum3);
    pet.setTiredness(randomNum4);

    System.out.println("welcome to virtual pet please enter name for a pet  ");
    petName= scanner2.nextLine();

    boolean i = true;
    while (i == true) {

      System.out.println("Horace the "+ petName);
      System.out.println("Hunger: " + pet.getHunger() + "\n" + "thirst: " + pet.getThirst() + "\n" +
          "Boredom: " + pet.getBoredom() + "\n" + "Tiredness: " + pet.getTiredness());

      System.out.println("What you want to do ? \n" + "1. Feed Pet \n" + "2. Water Pet \n" +
          "3. Play with Pet \n" + "4. Put Pet to sleep \n" +"5. tick \n" 
          + "Enter any other number to leave the Pet alone");

      userInput = scanner.nextInt();
      if (userInput == 1) {
        System.out.println("1. Medium meal " + "\n" + "2. large meal ");
        userInput1 = scanner.nextInt();
        if (userInput1 == 1) {
          pet.eatM();
        } else {
          pet.eatL();
        }
      }

      else if (userInput == 2) {
        System.out.println("1. Medium amount of water" + "\n" + "2. Large amount of water ");
        userInput1 = scanner.nextInt();
        if (userInput1 == 1) {
          pet.drinkM();
        } else {
          pet.drinkL();
        }
      }

      else if (userInput == 3) {
        System.out.println("1. Play for three mins" + "\n" + "2. Play for five mins");
        userInput1 = scanner.nextInt();
        if (userInput1 == 1) {
          pet.playM();
        } else {
          pet.playL();
        }
      } else if (userInput == 4) {
        System.out.println("1. Sleep for five mins" + "\n" + "2. Sleep for ten mins");
        userInput1 = scanner.nextInt();
        if (userInput1 == 1) {
          pet.sleepM();
        } else {
          pet.sleepL();
        }
      } else if (userInput == 5){
         pet.tick();
      }
        else {
        System.out.println("goodbye");
        i = false;
      }
    }
    ;
    
    scanner.close();
    scanner2.close();
  }

}
