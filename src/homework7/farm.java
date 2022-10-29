package homework7;

public class farm{
    protected int animals = 4;
    protected int legs;
    protected int horns;
    public int getAnimals(){
        return animals;
    }
    public void setAnimals(int animals){
        if ( animals <0){
            System.out.println("Oh,no! It can`t be.");
            return;
        }
        this.animals=animals;

    }





    void hello(){
        System.out.println("There are "+animals+ " animals  in my farm");
    }


}




