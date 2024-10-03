package cup;

public class Animal {
    public String penis;
    public int lapi;

    public Animal(String penis) {
        this.penis = penis;
    }

    public Animal() {
    }

    public Animal(int lapi) {
        this.lapi = lapi;
    }

    public Animal(String penis, int lapi) {
        this.penis = penis;
        this.lapi = lapi;
    }
    public void pokazPenisa(){
        System.out.println("Смотри какой пенис!!" + this.penis);
    }
}