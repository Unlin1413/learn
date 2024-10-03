import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HelloZ {

    // в массиве числа целые от 1 до 100
    // пройтись по массиву и если число делится на 3 вывести в консоль foo
    // если делиться на 5 вывести bar
    // еслит делится и на 3 и на 5 вывести foo bar
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "нет");
        map.put(2, "да");
        map.put(3, "не знаю");
        Random random = new Random();
        int i = random.nextInt(1,3);
        System.out.println(map.get(i));
    }
}
