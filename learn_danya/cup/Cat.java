package cup;

public class Cat extends Animal{
    private String name;
    public String color;
    public int age;
    public Cat(String name, String color, int age, String penis, int lapi ){
        super(penis, lapi);
        this.color = color;
        this.name = name;
        this.age = age;
    }
    public Cat(String name, String color){
        this.name = name;
        this.color = color;
    }
    public void satMeow(){
        System.out.println(this.name + " " + "MAY");
    }
    public  void plusAge(){
        this.age++;
    }

    @Override
    public void pokazPenisa() {
        System.out.println("Смотри какой БОЛЬШРОЙ> пенис!!" + this.penis);;
    }
    public String pokazPenisa2() {
        String penis1 = this.penis;
        return penis1;
    }
    public String pokazPenis3(){
        for (int i = 0; i < 199; i++) {
            System.out.println(penis);
            if(i == 22){
                return penis;
            }
        }
        return null;
    }

}