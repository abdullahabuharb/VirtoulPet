package VirtualPet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter extends VirtualPet{

    
    public VirtualPetShelter(String name, String description, int hunger, int thirst, int boredom) {
        super(name, description, hunger, thirst, boredom);
    
    }
    public VirtualPetShelter(String name,String description){
        super(name,description);
    }
    Map<String,VirtualPet> allPets=new HashMap<>() ;
    Map<String,VirtualRobotic> allRobotic=new HashMap<>() ;
    
    public  Collection<VirtualPet> returnAllPets(){
        return allPets.values();
    }
    public void returnPetsName(){
        for(String key:allPets.keySet()){
            System.out.println(key);
        }
    }
    
        public VirtualPet getPetName(String name){
            return allPets.get(name);
        }
        public void addPets(VirtualPet pet){
            allPets.put(pet.getName(),pet);
        }
        public void addRobotic(VirtualRobotic pet){
            allRobotic.put(pet.getName(),pet);
        }
        
        public void removePet(VirtualPet pet){
            allPets.remove(pet.getName(), pet);
        }
        public void removeRobotic(VirtualRobotic pet){
            allRobotic.remove(pet.getName(), pet);
        }
        public void feedAllPets(){
            for(VirtualPet pet:allPets.values())
            pet.eat();
        }
        public void waterAllPets(){
            for(VirtualPet pet:allPets.values())
            pet.drink();
        }
        public void playWithPet(){
            for(VirtualPet pet:allPets.values())
            pet.walk();
        }
        public void tick2(){
            tick();
        }
        public void oilingAllRobotic(){
            for(VirtualRobotic pet:allRobotic.values())
            pet.oiling();
        }
        public void emptyingAllLitterBox(){
            for(VirtualRobotic pet:allRobotic.values())
            pet.emptyingLitterBox();
        }
        public void cleanCages(){
            for(VirtualRobotic pet:allRobotic.values())
            pet.cleanWaste();
        }
    

} 