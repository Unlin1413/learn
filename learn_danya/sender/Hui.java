package sender;

public class Hui {
    public static void main(String[] args) {
        EmailSender email = new EmailSender();
        SmsSender smska = new SmsSender();
        email.sendSms("Putin", "Курск утонул");
        smska.sendSms("Зеленский", "Ок");
    }
}
