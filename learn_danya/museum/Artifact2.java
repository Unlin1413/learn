package museum;

public class Artifact2 extends Relikviya {
    public Artifact2(int number, String culture){
        super(number, culture, null);
    }
    public void artifactPerv(){
        System.out.println("Номер этого артифакта: " + super.number + " Культура этого артифакта: " + this.culture);
    }
}