import java.util.Random;

public class VirtualPet {
    private int hunger;
    private int thirst;
    private int boredom;
    private String name;
    private String description;

    public VirtualPet(String name,String description){
        this.name=name;
        this.description=description;
    }
    public VirtualPet(String name,String description,int hunger,int thirst,int boredom){
        this.name=name;
        this.description=description;
        this.hunger=hunger;
        this.thirst=thirst;
        this.boredom=boredom;
    }
    public void tick(){
        if(getHunger()<=44)setHunger(hunger +5);
        if(getBoredom()<=44)setBoredom(boredom +5);
        if(getThirst()<=44)setThirst(thirst +5);
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

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }



    public void eat() {
        if(getHunger()>=11){setHunger(hunger - 10);};
        if(getThirst()<=44){setThirst(thirst + 5);};
        if(getBoredom()<=44){setBoredom(boredom + 5);};
    }



    public void drink() {
        if(getThirst()>=11){setThirst(thirst - 10);};
        if(getBoredom()<=44){setBoredom(boredom + 5);};
        if(getHunger()<=44){setHunger(hunger + 5);};
    }




    public void play() {
        if(getBoredom()>=11){ setBoredom(boredom - 10);};
        if(getThirst()<=44){setThirst(thirst + 5);};
        if(getHunger()<=44){setHunger(hunger + 5);}
    }
    public int randomValues(){
        Random random = new Random();
        int min = 10, max = 50;
        int randomNumber = random.nextInt(max - min + 1) + min; 
        return randomNumber;
    }
    
    
}