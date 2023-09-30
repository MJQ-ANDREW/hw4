package jobComputer;

public class Motherboard extends Component{
    private String socket;
    private String chipset;
    private int maxROM;
    public Motherboard(float h, float w, float d, float ec, String sc, String cs, int mxr){
        super(h, w, d, ec);
        this.componentName = "Motherboard";
        this.socket = sc;
        this.chipset = cs;
        this.maxROM  = mxr;
    }

    public String getSocket() {
        return socket;
    }

    public String getChipset() {
        return chipset;
    }

    public int getMaxROM() {
        return maxROM;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "socket='" + socket + '\'' +
                ", chipset='" + chipset + '\'' +
                ", maxROM=" + maxROM +
                ", componentName='" + componentName + '\'' +
                '}';
    }
}
