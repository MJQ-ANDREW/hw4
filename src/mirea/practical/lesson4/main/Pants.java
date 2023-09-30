package mirea.practical.lesson4.main;

public class Pants extends Clothes implements ManClothing, WomanClothing {
    public Pants(Sizes sz, float pr, String cl){
        super(sz, pr, cl);
        this.name = "Pants";
    }

    public void dressMan() {
        System.out.println("The man put on a pants");
    }

    public void dressWoman() {
        System.out.println("The woman put on a pants");
    }
}
