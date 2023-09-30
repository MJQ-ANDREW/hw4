package mirea.practical.lesson4.main;

public class TShirt extends Clothes implements ManClothing, WomanClothing {
    public TShirt(Sizes sz, float pr, String cl){
        super(sz, pr, cl);
        this.name = "T-Shirt";
    }

    public void dressMan() {
        System.out.println("The man put on a T-shirt");
    }

    public void dressWoman() {
        System.out.println("The woman put on a T-shirt");
    }


}
