package museum;

public class Artifact1 extends Relikviya {
    private String jopa;
    public Artifact1(int number) {
        super(number, null, null);
    }

    public String getJopa() {
        return jopa;
    }


    public void artifactPerv() {
        System.out.println("Номер этого артифакта: " + this.number);
    }
}