package homework7;

public class Cows extends farm{
    protected String voice;
    public String getVoice(){
        return voice;
    }
    public int getLegs(){
        return legs;
    }
    public void setLegs( int legs){
        if (legs<0){
            System.out.println("Error");
            return;
        }
        this.legs=legs;
    }
    public int getHorns(){
        return horns;
    }
    public void setHorns(int horns){
        if (horns<0){
            System.out.println("Error");
            return;
        }
        this.horns=horns;
    }
    public void setVoice(String voice){
        this.voice=voice;
    }
    protected String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
  public void talk(){
       System.out.println("I`m a cow "+name+" with "+ legs+ " legs and "+ horns+ " horns,"+voice   );

    }


}
