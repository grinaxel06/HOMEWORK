package Example;

public class Thrinity <T extends Comparable<T>> {
   private T first;
   private T second;
   private T third;
   private T getFirst(){
       return first;
   }
   private T getSecond(){
       return second;
   }
   private T getThird(){
       return third;
   }

    public void setFirst(T first) {
       if(first==null){
           return;
       }
        this.first = first;
    }

    public void setSecond(T second) {
       if(second==null){
           return;
       }
        this.second = second;
    }

    public void setThird(T third) {
       if(third==null){
           return;
       }
        this.third = third;
    }

    public Thrinity (T first, T second, T third ){
       this.first =first;
       this.second=second;
       this.third=third;
       sortThrinity(first,second,third);
   }
   private void sortThrinity(T first, T second, T third){
       T dd;
       if(first.compareTo(second)<0){
           dd =first;
           first = second;
           second=dd;
       }
       if(first.compareTo(third)<0){
           dd =first;
           first=third;
           third=dd;
       }
       if(second.compareTo(third)<0){
           dd=second;
           second=third;
           third=dd;
       }
       setFirst(first);
       setSecond(second);
       setThird(third);
   }

    @Override
    public String toString() {
        return first+" "+ second+ " "+third;
    }
}
