
import java.util.Scanner;

public class VirtualPetShelterApp  {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        int userInput;
        String userInput1,userInput2;
        VirtualPetShelter pets =new VirtualPetShelter("", "");
        
        VirtualPet pet1 =new VirtualPet("Joey","smells like a Stargazer lily fresh with morning dew");
        pet1.setHunger(pet1.randomValues());
        pet1.setThirst(pet1.randomValues());
        pet1.setBoredom(pet1.randomValues());
        pets.addPets(pet1);

        
        VirtualPet pet2 =new VirtualPet("Johnny","cute curly hair");
        pet2.setHunger(pet2.randomValues());
        pet2.setThirst(pet2.randomValues());
        pet2.setBoredom(pet2.randomValues());
        pets.addPets(pet2);
        
        VirtualPet pet3= new VirtualPet("Dee","very small but strong");
        pet3.setHunger(pet3.randomValues());
        pet3.setThirst(pet3.randomValues());
        pet3.setBoredom(pet3.randomValues());
        pets.addPets(pet3);
        
        VirtualPet pet4=new VirtualPet("Tommy","soft skin");
        pet4.setHunger(pet4.randomValues());
        pet4.setThirst(pet4.randomValues());
        pet4.setBoredom(pet4.randomValues());
        pets.addPets(pet4);
        
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
                pets.feedAllPets();
                pets.tick2();
            }
            if(userInput == 2){
                pets.waterAllPets();
                pets.tick2();
            }
            if(userInput == 3){
                System.out.println("please choose one of the pets");
                pets.returnPetsName();
                userInput1=scanner2.nextLine();
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
                    System.out.println("Sorry there is no pet with this name \n"+"pets in shelter\n");
                    pets.returnPetsName();
                }
                pets.tick2();
            }
            if(userInput == 4){
                System.out.println("choose one of the pets");
                pets.returnPetsName();
                userInput1=scanner3.nextLine();
                if(userInput1.equalsIgnoreCase("Joey")){
                    pets.removePet(pet1);
                System.out.println("Joey has removed\n");
                pets.returnPetsName();}
                if(userInput1.equalsIgnoreCase("Johnny")){
                    pets.removePet(pet2);
                    System.out.println("Johnny has removed\n");
                    pets.returnPetsName();
                }
                if(userInput1.equalsIgnoreCase("Dee")){
                    pets.removePet(pet3);
                    System.out.println("Dee has removed\n");
                    pets.returnPetsName();
                }
                if(userInput1.equalsIgnoreCase("Tommy")){
                    pets.removePet(pet4);
                    System.out.println("Tommy has removed\n");
                    pets.returnPetsName();
                }
                else{
                    System.out.println("Sorry there is no pet with this name ");
                }
                pets.tick2();
            }
            if(userInput == 5){
                System.out.println("what is the pet name?");
                userInput1=scanner2.nextLine();
                System.out.println("what is the pet description?");
                userInput2=scanner3.nextLine();
                System.out.println(userInput1 +" has been added to Shelter");
                VirtualPet pet5 =new VirtualPet(userInput1,userInput2);
                pet5.setHunger(pet5.randomValues());
                pet5.setThirst(pet5.randomValues());
                pet5.setBoredom(pet5.randomValues());
                pets.addPets(pet5);
                System.out.println("shelter pets");
                pets.returnPetsName();
                pets.tick2();
            }
            if(userInput == 6){
                i=false;
            }
    
    }
    scanner.close();
    scanner2.close();
    scanner3.close();
    }
}