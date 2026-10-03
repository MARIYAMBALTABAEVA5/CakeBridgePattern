public class WeddingCake extends Cake {

    public WeddingCake(CakeDecorator decorator) {
        super(decorator);
    }

    @Override
    public void makeCake() {
        System.out.println("Making a wedding cake.");
        decorator.decorate();
    }
}