package interfaces;

public class Iphone implements Phone {
    @Override
    public void call(String number) {
        System.out.println("звоню с айфона");
    }

    @Override
    public void calculator(int a) {

    }

    public void viebivatsya(){
        System.out.println("я выебываюсь");
    }
}
