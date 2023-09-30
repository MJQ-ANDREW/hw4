package mirea.practical.lesson4.main;

public abstract class Clothes {
    private Sizes clothesSize;
    private float price;
    private String color;
    protected String name;

    public Clothes(Sizes sz, float pr, String cl){
        this.clothesSize = sz;
        this.price = pr;
        this.color = cl;
    }
    public String getName(){
        return this.name;
    }

    public Sizes getClothesSize() {
        return clothesSize;
    }

    public void setClothesSize(Sizes clothesSize) {
        this.clothesSize = clothesSize;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
