package kebab;// 烤肉

public abstract class Kebab {
    /** isVeggie Check if a kebab contains only vegetarian foods,
     * regardless of what kebab.Holder it is on.
     * @return The kebab contains only vegetarian.
     */
    abstract boolean isVeggie();

    /**
     * @return The type of the field of holder
     */
    abstract Object whatHolder();

    public static void main(String[] args) {
        System.out.println(new Pepper(new Shallot(new Radish(new Holder(new Gold())))).whatHolder());
    }
}
// 容器
class Holder extends Kebab{
    Object o;

    public Holder(Object o) {
        this.o = o;
    }

    @Override
    boolean isVeggie() {
        return true;
    }

    @Override
    Object whatHolder() {
        return o;
    }
}
// 一些烤肉材料

// 葱
class Shallot extends Kebab{
    Kebab k;

    public Shallot(Kebab k) {
        this.k = k;
    }

    @Override
    boolean isVeggie() {
        return k.isVeggie();
    }

    @Override
    Object whatHolder() {
        return k.whatHolder();
    }
}
// 虾
class Shrimp extends Kebab{
    Kebab k;

    public Shrimp(Kebab k) {
        this.k = k;
    }

    @Override
    boolean isVeggie() {
        return false;
    }

    @Override
    Object whatHolder() {
        return k.whatHolder();
    }
}
// 萝卜
class Radish extends Kebab{
    Kebab k;

    public Radish(Kebab k) {
        this.k = k;
    }

    @Override
    boolean isVeggie() {
        return k.isVeggie();
    }

    @Override
    Object whatHolder() {
        return k.whatHolder();
    }
}
// 胡椒粉
class Pepper extends Kebab{
    Kebab k;

    public Pepper(Kebab k) {
        this.k = k;
    }

    @Override
    boolean isVeggie() {
        return k.isVeggie();
    }
    @Override
    Object whatHolder() {
        return k.whatHolder();
    }
}
// 西葫芦
class Zucchini extends Kebab{
    Kebab k;
    Zucchini(Kebab k){
        this.k=k;
    }

    @Override
    boolean isVeggie() {
        return k.isVeggie();
    }

    @Override
    Object whatHolder() {
        return k.whatHolder();
    }
}
// 一些容器
// 杆/棍棒
abstract class Rod{
}
// 匕首
class Dagger extends Rod{

}
// 军刀
class Sabre extends Rod{

}
// 剑
class Sword extends Rod{

}
// 盘子
abstract class Plate{

}
// 金
class Gold extends Plate {

}
// 银
class Silver extends Plate {

}
// 黄铜
class Brass extends Plate {

}
// 铜
class Copper extends Plate {

}
// 木头
class Wood extends Plate {

}