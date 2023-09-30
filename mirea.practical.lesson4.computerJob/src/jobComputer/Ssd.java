package jobComputer;

public class Ssd extends Component{
    private int memory;
    public Ssd(float h, float w, float d, float ec, int m){
        super(h, w, d, ec);
        this.memory = m;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "Ssd{" +
                "memory=" + memory +
                ", componentName='" + componentName + '\'' +
                '}';
    }
}
