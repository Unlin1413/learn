package sender;

public class SmsSender extends BaseSender {
    @Override
    public void sendSms(String from, String text) {
        System.out.println("sms" + from + text);
    }
}
