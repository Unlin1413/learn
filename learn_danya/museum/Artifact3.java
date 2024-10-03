package museum;

public class Artifact3 extends Relikviya {
    public Artifact3(int number, String culture, int century) {
        super(number, culture, century);
    }
    public void artifactPerv(){
        System.out.println("Номер этого артифакта: " + this.number + " Культура этого артифакта: " + this.culture + " Век в котором появился этот артифакт: " + this.century);
    }
}