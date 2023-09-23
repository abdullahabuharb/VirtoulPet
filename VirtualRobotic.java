package VirtualPet;
public class VirtualRobotic extends VirtualPet {

    private int rust;
    public VirtualRobotic(String name, String description) {
        super(name, description);
        
    }
    public int getRust() {
        return rust;
    }
    
    public void setRust(int rust) {
        this.rust = rust;
    }
    public void oiling(){
        if(getHealth()<=39){setHealth(health+ 10);}
        if(getHappiness()<=39){setHappiness(happiness+ 10);}
    }
    

    @Override
    public void eat(){
        System.out.println("this is Robotic does not need to eat  ");
    }
    @Override
    public void drink(){
        System.out.println("this is Robotic does not need to drink  ");
    }
    @Override
    public void walk(){
        System.out.println("this is Robotic does not need to walk  ");
    }
    @Override
    public void tick(){
        if(rust<=80){
            rust+=10;
        }
        if(getHappiness()>=8){
            setHappiness(happiness-6);
        }
    }

    
    
}
