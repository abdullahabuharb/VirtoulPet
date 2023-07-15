public class VirtualPet {
    private int hunger;
    private int thirst;
    private int boredom;
    private int tiredness;

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
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

    public int getTiredness() {
        return tiredness;
    }

    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    public void eatM() {
        System.out.println("Pet is eating medium meal.");
        if(getHunger()>=3){setHunger(hunger - 2);};
        if(getThirst()<=18){setThirst(thirst + 2);};
    }

    public void eatL() {
        System.out.println("Pet is eating large meal.");
        if(getHunger()>=4){setHunger(hunger - 3);};
        if(getThirst()<=17){setThirst(thirst + 3);};
    }

    public void drinkM() {
        System.out.println("Pet is drinking medium amount of water.");
        if(getThirst()>=3){setThirst(thirst - 2);};
        if(getBoredom()<=18){setBoredom(boredom + 2);};
    }

    public void drinkL() {
        System.out.println("Pet is drinking large amount of water.");
        if(getThirst()>=4){setThirst(thirst - 3);};
        if(getBoredom()<=17){setBoredom(boredom + 3);};
    }


    public void playM() {
        System.out.println("Pet is playing for two mins.");
        if(getBoredom()>=3){ setBoredom(boredom - 2);};
        if(getTiredness()<=18){setTiredness(tiredness + 2);};
    }

    public void playL() {
        System.out.println("Pet is playing for three mins.");
        if(getBoredom()>=4){ setBoredom(boredom - 3);};
        if(getTiredness()<=17){setTiredness(tiredness + 3);};
    }

    public void sleepM() {
        System.out.println("Pet is sleeping for five  mins.");
        if(getTiredness()>=3){setTiredness(tiredness - 2);};
        if(getHunger()<=18){setHunger(hunger + 2);};
    }

    public void sleepL() {
        System.out.println("Pet is sleeping for ten mins.");
        if(getTiredness()>=4){setTiredness(tiredness - 3);};
        if(getHunger()<=17){setHunger(hunger + 3);};
    }

    public void tick(){
        if(getHunger()<=18)setHunger(hunger +2);
        if(getBoredom()<=18)setBoredom(boredom +2);
        if(getTiredness()<=18)setTiredness(tiredness +2);
    }

}