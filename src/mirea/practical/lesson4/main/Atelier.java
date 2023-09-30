package mirea.practical.lesson4.main;

public class Atelier {
    public String dressWoman(Clothes[] wardrobe) {
        String res = "Woman have a ";
        for (int i = 0; i < wardrobe.length; i++) {
            res += wardrobe[i].getColor() + " " + wardrobe[i].getName() + " size " + wardrobe[i].getClothesSize() + " worth " + wardrobe[i].getPrice() + " dollars, ";
        }
        return res.substring(0, res.length() - 2);
    }

    public String dressMan(Clothes[] wardrobe) {
        String res = "Man have a ";
        for (int i = 0; i < wardrobe.length; i++) {
            res += wardrobe[i].getColor() + " " + wardrobe[i].getName() + " size " + wardrobe[i].getClothesSize() + " worth " + wardrobe[i].getPrice() + " dollars, ";
        }
        return res.substring(0, res.length() - 2);
    }
}
