package museum;

public class Artifact1 extends Relikviya {
    public Artifact1(int number){
        super(number, null, null);
    }
    public void artifactPerv(){
        System.out.println("Номер этого артифакта: " + this.number);
    }
}