package jobComputer;

public class Videocard extends Component{
    private String resolution;
    private float frequencyRegen;
    private int videoMemory;
    public Videocard(float h, float w, float d, float ec, String res, float fr, int vm){
        super(h, w, d, ec);
        this.componentName = "Videocard";
        this.resolution = res;
        this.frequencyRegen = fr;
        this.videoMemory = vm;
    }

    @Override
    public String toString() {
        return "Videocard{" +
                "resolution='" + resolution + '\'' +
                ", frequencyRegen='" + frequencyRegen + '\'' +
                ", videoMemory=" + videoMemory +
                ", componentName='" + componentName + '\'' +
                '}';
    }

    public String getResolution() {
        return resolution;
    }

    public float getFrequencyRegen() {
        return frequencyRegen;
    }

    public int getVideoMemory() {
        return videoMemory;
    }
}
