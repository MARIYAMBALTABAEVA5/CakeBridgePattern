public class FruitDecorator implements CakeDecorator {

    @Override
    public void decorate() {
        System.out.println("Decorated with fresh fruits.");
    }
}