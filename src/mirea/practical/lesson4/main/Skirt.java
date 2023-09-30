package mirea.practical.lesson4.main;

public class Skirt extends Clothes implements WomanClothing {
    public Skirt(Sizes sz, float pr, String cl){
        super(sz, pr, cl);
        this.name = "Skirt";
    }

    public void dressWoman() {
        System.out.println("The woman put on a skirt");
    }
}
