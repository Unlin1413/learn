package interfaces;

// abstract class означает что у класса могут быть abstract методы
public abstract class AbstractPhone {
    private String id;

    //abstract метод - можно не реализовывать
    public abstract void call(String number);

    public void call2(String number) {
        System.out.println("звоню");
    }
}
