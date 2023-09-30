package jobComputer;

public class Processor extends Component {
    private float frequency;
    private int coreQuantity;
    private int streamsQuantity;

    public Processor(float h, float w, float d, float ec, float f, int c, int s){
        super(h, w, d, ec);
        this.componentName = "Processor";
        this.frequency = f;
        this.coreQuantity = c;
        this.streamsQuantity = s;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", coreQuantity=" + coreQuantity +
                ", streamsQuantity=" + streamsQuantity +
                ", componentName='" + componentName + '\'' +
                '}';
    }

    public float getFrequency() {
        return frequency;
    }

    public int getCoreQuantity() {
        return coreQuantity;
    }

    public int getStreamsQuantity() {
        return streamsQuantity;
    }
}
