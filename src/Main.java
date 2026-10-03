public class Main {

    public static void main(String[] args) {

        CakeDecorator chocolate = new ChocolateDecorator();
        CakeDecorator fruit = new FruitDecorator();

        Cake birthdayCake = new BirthdayCake(chocolate);
        birthdayCake.makeCake();

        System.out.println();

        Cake weddingCake = new WeddingCake(fruit);
        weddingCake.makeCake();

        System.out.println();

        Cake birthdayCakeWithFruit = new BirthdayCake(fruit);
        birthdayCakeWithFruit.makeCake();
    }
}