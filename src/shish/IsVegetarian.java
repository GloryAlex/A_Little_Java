package shish;

public class IsVegetarian {
    public boolean forSkewer(){
        return true;
    }
    public boolean forOnion(Shish s){
        return s.isVegetarian();
    }
    public boolean forLamb(Shish s){
        return false;
    }
    public boolean forTomato(Shish s){
        return s.isVegetarian();
    }
}
