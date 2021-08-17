package shish;

/**
 * 烤串
 */
public abstract class Shish {
    OnlyOnions ooFn = new OnlyOnions();
    IsVegetarian isVg=new IsVegetarian();
    abstract boolean onlyOnions();
    // 是否适合素食主义者
    abstract boolean isVegetarian();
}

/**
 * 铁签
 */
class Skewer extends Shish {
    @Override
    boolean onlyOnions() {
        return ooFn.forSkewer();
    }

    @Override
    boolean isVegetarian() {
        return isVg.forSkewer();
    }
}

/**
 * 洋葱
 */
class Onion extends Shish {
    Shish s;

    public Onion(Shish s) {
        this.s = s;
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forOnion(s);
    }

    @Override
    boolean isVegetarian() {
        return isVg.forOnion(s);
    }
}

// 羊肉
class Lamb extends Shish {
    Shish s;

    public Lamb(Shish s) {
        this.s = s;
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forLamb(s);
    }

    @Override
    boolean isVegetarian() {
        return isVg.forLamb(s);
    }
}

// 土豆
class Tomato extends Shish {
    Shish s;

    public Tomato(Shish s) {
        this.s = s;
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forTomato(s);
    }

    @Override
    boolean isVegetarian() {
        return isVg.forTomato(s);
    }
}


