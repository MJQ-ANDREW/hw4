package jobComputer;

public class Ram extends Component {
    private int memory;
    private float frequency;

    public Ram(float h, float w, float d, float ec, int m, float f) {
        super(h, w, d, ec);
        this.memory = m;
        this.frequency = f;

    }

    public int getMemory() {
        return memory;
    }

    public float getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "memory=" + memory +
                ", frequency=" + frequency +
                ", componentName='" + componentName + '\'' +
                '}';
    }
}
