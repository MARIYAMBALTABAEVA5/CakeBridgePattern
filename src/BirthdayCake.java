public class BirthdayCake extends Cake {

    public BirthdayCake(CakeDecorator decorator) {
        super(decorator);
    }

    @Override
    public void makeCake() {
        System.out.println("Making a birthday cake.");
        decorator.decorate();
    }
}