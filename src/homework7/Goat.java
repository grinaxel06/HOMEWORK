package homework7;

public class Goat extends Cows {
   protected String beard;
    public void setBeard(String beard){
        this.beard=beard;
    }


    public void talk(){
        System.out.println("I`m a goat "+name+" with "+ legs+ " legs and "+ horns+ " horns and "+beard+ " beard, "+voice );
    }


}
