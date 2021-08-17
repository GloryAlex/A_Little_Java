public abstract class Num {}

class Zero extends Num {}
class OneMoreThan extends Num{
    Num predecessor; // 前驱

    public OneMoreThan(Num p) {
        this.predecessor = p;
    }
}
