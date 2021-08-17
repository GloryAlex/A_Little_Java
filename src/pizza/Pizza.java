package pizza;

public abstract class Pizza {
    abstract Pizza removeAnchovy();
    abstract Pizza topAnchovyWithCheese();
    abstract Pizza replaceAnchovyWithCheese();

    public static void main(String[] args) {
        var a = new Olive(new Cheese(new Anchovy(new Olive(new Crust())))).topAnchovyWithCheese();
        var b = new Olive(new Cheese(new Anchovy(new Olive(new Crust())))).removeAnchovy().topAnchovyWithCheese();
        var c=new Sausage(new Anchovy(new Cheese(new Crust()))).replaceAnchovyWithCheese();
        System.out.println(a);
    }
}

// 面包皮
class Crust extends Pizza {
    @Override
    Pizza removeAnchovy() {
        return new Crust();
    }

    @Override
    Pizza topAnchovyWithCheese() {
        return new Crust();
    }

    @Override
    Pizza replaceAnchovyWithCheese() {
        return new Crust();
    }
}

class Cheese extends Pizza {
    Pizza p;

    public Cheese(Pizza p) {
        this.p = p;
    }

    @Override
    Pizza removeAnchovy() {
        return new Cheese(p.removeAnchovy());
    }

    @Override
    Pizza topAnchovyWithCheese() {
        return new Cheese(p.topAnchovyWithCheese());
    }

    @Override
    Pizza replaceAnchovyWithCheese() {
        return new Cheese(p.replaceAnchovyWithCheese());
    }
}

// 橄榄
class Olive extends Pizza {
    Pizza p;

    public Olive(Pizza p) {
        this.p = p;
    }

    @Override
    Pizza removeAnchovy() {
        return new Olive(p.removeAnchovy());
    }

    @Override
    Pizza topAnchovyWithCheese() {
        return new Olive(p.topAnchovyWithCheese());
    }

    @Override
    Pizza replaceAnchovyWithCheese() {
        return new Olive(p.replaceAnchovyWithCheese());
    }
}

// 沙丁鱼
class Anchovy extends Pizza {
    Pizza p;

    public Anchovy(Pizza p) {
        this.p = p;
    }

    @Override
    Pizza removeAnchovy() {
        return p.removeAnchovy();
    }

    @Override
    Pizza topAnchovyWithCheese() {
        return new Cheese(new Anchovy(p));
    }

    @Override
    Pizza replaceAnchovyWithCheese() {
        return new Cheese(p.replaceAnchovyWithCheese());
    }
}

// 香肠
class Sausage extends Pizza {
    Pizza p;

    Sausage(Pizza p) {
        this.p = p;
    }

    @Override
    Pizza removeAnchovy() {
        return new Sausage(p.removeAnchovy());
    }

    @Override
    Pizza topAnchovyWithCheese() {
        return new Sausage(p.topAnchovyWithCheese());
    }

    @Override
    Pizza replaceAnchovyWithCheese() {
        return new Sausage(p.replaceAnchovyWithCheese());
    }
}
