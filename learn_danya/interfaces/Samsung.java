package interfaces;

public class Samsung implements Phone {
    @Override
    public void call(String number) {
        System.out.println("звоню с самсунга");
    }

    @Override
    public void calculator(int a) {

    }
}
