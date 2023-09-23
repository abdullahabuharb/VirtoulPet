package VirtualPet;

import java.util.Random;

public class VirtualPet {
    private int hunger;
    private int thirst;
    protected int happiness;
    private String name;
    private String description;
    protected int health;
    private int waste ;
    private int litterBox;

    public VirtualPet(String name,String description){
        this.name=name;
        this.description=description;
    }
    public VirtualPet(String name,String description,int hunger,int thirst,int happiness){
        this.name=name;
        this.description=description;
        this.hunger=hunger;
        this.thirst=thirst;
        this.happiness=happiness;
    }
    public void tick(){
        if(getHunger()<=44)setHunger(hunger +5);
        if(getHappiness()>=6)setHappiness(happiness -5);
        if(getThirst()<=44)setThirst(thirst +5);
        if(getWaste() <= 80)setWaste(waste+10);
        if(getLitterBox() <=80)setLitterBox(litterBox+=10);
    }
     public void setWaste(int waste) {
        this.waste = waste;
    }
    public void setLitterBox(int litterBox) {
        this.litterBox = litterBox;
    }
    public int getWaste() {
        return waste;
    }
    public int getLitterBox() {
        return litterBox;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public String getDescription() {
        return description;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }



    public void eat() {
        if(getHunger()>=11){setHunger(hunger - 10);}
        if(getThirst()<=44){setThirst(thirst + 5);}
        if(getHappiness()<=44){setHappiness(happiness + 5);}
    }



    public void drink() {
        if(getThirst()>=11){setThirst(thirst - 10);};
        if(getHappiness()<=44){setHappiness(happiness + 5);};
        if(getHunger()<=44){setHunger(hunger + 5);};
    }




    public void walk() {
        if(getHappiness()<=39){ setHappiness(happiness + 10);};
        if(getThirst()<=44){setThirst(thirst + 5);};
        if(getHunger()<=44){setHunger(hunger + 5);}
    }
    public int randomValues(){
        Random random = new Random();
        int min = 10, max = 50;
        int randomNumber = random.nextInt(max - min + 1) + min; 
        return randomNumber;
    }
    public void emptyingLitterBox(){
        litterBox-=litterBox;
    }
    public void cleanWaste(){
        waste-=waste;
    }
   
    
  
    
}