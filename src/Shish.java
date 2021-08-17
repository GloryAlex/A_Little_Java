/**
 * 烤串
 */
public abstract class Shish {
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
        return true;
    }

    @Override
    boolean isVegetarian() {
        return true;
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
        return s.onlyOnions();
    }

    @Override
    boolean isVegetarian() {
        return s.isVegetarian();
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
        return false;
    }

    @Override
    boolean isVegetarian() {
        return false;
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
        return false;
    }

    @Override
    boolean isVegetarian() {
        return s.isVegetarian();
    }
}


