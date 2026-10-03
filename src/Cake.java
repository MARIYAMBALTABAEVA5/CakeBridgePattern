public abstract class Cake {

    protected CakeDecorator decorator;

    public Cake(CakeDecorator decorator) {
        this.decorator = decorator;
    }

    public abstract void makeCake();
}