public abstract class Layer {}

class Base extends Layer{
    Object o;

    public Base(Object o) {
        this.o = o;
    }
}
class Slice extends Layer{
    Layer l;

    public Slice(Layer l) {
        this.l = l;
    }
}
