package mirea.practical.lesson4.main;

public class Tie extends Clothes implements ManClothing {
    public Tie(Sizes sz, float pr, String cl){
        super(sz, pr, cl);
        this.name = "Tie";
    }

    public void dressMan() {
        System.out.println("The man put on a tie");
    }
}
