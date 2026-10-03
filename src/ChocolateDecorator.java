public class ChocolateDecorator implements CakeDecorator {

    @Override
    public void decorate() {
        System.out.println("Decorated with chocolate.");
    }
}