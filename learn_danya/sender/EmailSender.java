package sender;

public class EmailSender extends BaseSender {
    @Override
    public void sendSms(String from, String text) {
        System.out.println("email" + from + text);
    }
}
