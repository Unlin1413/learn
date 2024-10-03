package museum;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Artifact1 artifact1 = new Artifact1(21);
        String jopa = artifact1.getJopa();
        artifact1.artifactPerv();
        Artifact2 artifact2 = new Artifact2(12, "Малазия");
        artifact2.artifactPerv();
        Artifact3 artifact3 = new Artifact3(13, "Италия", 15);
        artifact3.artifactPerv();
    }
}