package homework7;

public class Main {
    public static void main(String[] args) {
       farm lublino = new farm();
       lublino.setAnimals(3);

       Cows momo = new Cows();
       momo.setName("Momo");
       momo.setLegs(5);
       momo.setHorns(3);
       momo.setVoice("MOOOOOOOOO");
       momo.talk();
       Goat Boba = new Goat();
       Boba.setName("Boba");
       Boba.setVoice("BRUH");
       Boba.setLegs(4);
       Boba.setHorns(3);
       Boba.setBeard("long");
       Boba.talk();
       Ram Biba = new Ram();
       Biba.setName("Biba");
       Biba.setCurls(true);
       Biba.setVoice("SUIIIIIII");
       Biba.setLegs(10);
       Biba.setHorns(0);
       Biba.talk();
    }


}
