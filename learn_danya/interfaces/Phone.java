package interfaces;

public interface Phone {
    void call(String number);
    void calculator(int a);
    //все описанное в интерфейсе является строгим контрактом
    // все методы по дефолоту публичные
}
