import java.util.Random;
import java.util.Scanner;

public class VirtualPetShelterApp  {


    public static void main(String[] args) {
        
        Random random = new Random();
        int min = 10, max = 50;
        int randomNum1 = random.nextInt(max - min + 1) + min;
        int randomNum2 = random.nextInt(max - min + 1) + min;
        int randomNum3 = random.nextInt(max - min + 1) + min;
        int randomNum4 = random.nextInt(max - min + 1) + min;
        int randomNum5 = random.nextInt(max - min + 1) + min;
        int randomNum6 = random.nextInt(max - min + 1) + min;
        int randomNum7 = random.nextInt(max - min + 1) + min;
        int randomNum8 = random.nextInt(max - min + 1) + min;
        int randomNum9 = random.nextInt(max - min + 1) + min;
        int randomNum10 = random.nextInt(max - min + 1) + min;
        int randomNum11 = random.nextInt(max - min + 1) + min;
        int randomNum12 = random.nextInt(max - min + 1) + min;
        int randomNum13 = random.nextInt(max - min + 1) + min;
        int randomNum14 = random.nextInt(max - min + 1) + min;
        int randomNum15 = random.nextInt(max - min + 1) + min;
        
        Scanner scanner = new Scanner(System.in);
        int userInput;
        String userInput1,userInput2;
        
        VirtualPetShelter pet1 =new VirtualPetShelter("Joey","smells like a Stargazer lily fresh with morning dew");
        pet1.setHunger(randomNum1);
        pet1.setThirst(randomNum2);
        pet1.setBoredom(randomNum3);
        
        VirtualPetShelter pet2 =new VirtualPetShelter("Johnny","cute curly hair");
        pet2.setHunger(randomNum4);
        pet2.setThirst(randomNum5);
        pet2.setBoredom(randomNum6);
        
        VirtualPetShelter pet3= new VirtualPetShelter("Dee","very small but strong");
        pet3.setHunger(randomNum7);
        pet3.setThirst(randomNum8);
        pet3.setBoredom(randomNum9);
        
        VirtualPetShelter pet4=new VirtualPetShelter("Tommy","soft skin");
        pet4.setHunger(randomNum10);
        pet4.setThirst(randomNum11);
        pet4.setBoredom(randomNum12);
        
        System.out.println("welcome to virtual pet shelter");
        
        boolean i=true;
        while(i ==true){
            System.out.println("this is the status of your pets:");
            System.out.println("Name   |Hunger |Thirst |Boredom\n"+pet1.getName()+"   "+pet1.getHunger()+"     "+
            pet1.getThirst()+"     "+pet1.getBoredom()+"\n"+pet2.getName()+" "+pet2.getHunger()+"     "+
            pet2.getThirst()+"     "+pet2.getBoredom()+"\n"+pet3.getName()+"    "+pet3.getHunger()+"     "+
            pet3.getThirst()+"     "+pet3.getBoredom()+"\n"+pet4.getName()+"  "+pet4.getHunger()+"     "+
            pet4.getThirst()+"     "+pet4.getBoredom());
            System.out.println("what would you like to do next?\n"+"1.Feed the pets\n"+
            "2.Water the pets\n"+"3.Play with a pet\n"+"4.Adopt a pet\n"+"5.Admit a pet\n"+"6.Quit");
            userInput = scanner.nextInt();
            if(userInput == 1){
                pet1.feedAllPets();
                pet1.tick2();
            }
            if(userInput == 2){
                pet1.waterAllPets();
                pet1.tick2();
            }
            if(userInput == 3){
                System.out.println("please choose one of the pets");
                pet1.returnAllPets();
                userInput1=scanner.nextLine();
                if(userInput1.equalsIgnoreCase("Joey")){
                    System.out.println("ok,you play with Joey");
                    pet1.play();}
                if(userInput1.equalsIgnoreCase("Johnny")){
                    System.out.println("ok,you play with Johnny");
                    pet2.play();
                }
                if(userInput1.equalsIgnoreCase("Dee")){
                    System.out.println("ok,you play with Dee");
                    pet3.play();
                }
                if(userInput1.equalsIgnoreCase("Tommy")){
                    System.out.println("ok,you play with Tommy");
                    pet4.play();
                }
                else{
                    System.out.println("Sorry there is no pet with this name ");
                }
                pet1.tick2();
            }
            if(userInput == 4){
                System.out.println("what is the name of the pet");
                userInput1=scanner.nextLine();
                if(userInput1.equalsIgnoreCase("Joey")){
                    pet1.removePet(pet1);}
                if(userInput1.equalsIgnoreCase("Johnny")){
                    pet2.removePet(pet2);
                }
                if(userInput1.equalsIgnoreCase("Dee")){
                    pet3.removePet(pet3);
                }
                if(userInput1.equalsIgnoreCase("Tommy")){
                    pet4.removePet(pet4);
                }
                else{
                    System.out.println("Sorry there is no pet with this name ");
                }
                pet1.tick2();
            }
            if(userInput == 5){
                System.out.println("what is the pet name?");
                userInput1=scanner.nextLine();
                System.out.println("what is the pet description?");
                userInput2=scanner.nextLine();
                VirtualPetShelter pet5 =new VirtualPetShelter(userInput1,userInput2);
                pet5.setHunger(randomNum13);
                pet5.setThirst(randomNum14);
                pet5.setBoredom(randomNum15);
                pet5.addPets(pet5);
                pet1.tick2();
            }
            if(userInput == 6){
                i=false;
            }
    
    }scanner.close();
    }
}