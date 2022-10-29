package homework7;

public class Ram extends Cows {
    protected boolean curls;

    public void setCurls(boolean curls){
        this.curls=curls;
    }
    public void talk(){
        if (curls){
        System.out.println("I`m a goat "+name+" with "+ legs+ " legs and "+ horns+ " horns and curls, "+voice );}
        else{
            System.out.println("I`m a ram "+name+" with "+ legs+ " legs and "+ horns+ " horns "+voice );
        }
    }


}
