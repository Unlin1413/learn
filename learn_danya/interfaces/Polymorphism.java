package interfaces;

public class Polymorphism {
    public static void main(String[] args) {
        Phone phone = new Iphone();
        Phone phone2 = new Samsung();

        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();
        Phone[] phones = new Phone[]{iphone, samsung};
    }
}
