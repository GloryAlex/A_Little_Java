package shish;

public class OnlyOnions {
    boolean forSkewer(){
        return true;
    }
    boolean forOnion(Shish s){
        return s.onlyOnions();
    }
    boolean forLamb(Shish s){
        return false;
    }
    boolean forTomato(Shish s){
        return false;
    }
}
