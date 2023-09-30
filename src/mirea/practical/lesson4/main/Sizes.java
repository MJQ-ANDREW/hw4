package mirea.practical.lesson4.main;

public enum Sizes {
    XXS(32) {
        @Override
        public String GetDiscription() {
            return "Kid size";
        }
    }, XS(34), S(36), M(38), L(40);

    private int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public String GetDiscription() {
        return "Adult size";
    }


}
