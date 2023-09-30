package jobComputer;

public class Monitor extends Component{
    private String resolution;
    private float frequency;
    private String mainPort;
    public Monitor(int h, int w, int d, int ec, String r, float f, String p){
        super(h, w, d, ec);
        this.resolution = r;
        this.frequency = f;
        this.mainPort = p;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution='" + resolution + '\'' +
                ", frequency=" + frequency +
                ", mainPort='" + mainPort + '\'' +
                ", componentName='" + componentName + '\'' +
                '}';
    }

    public String getResolution() {
        return resolution;
    }

    public float getFrequency() {
        return frequency;
    }

    public String getMainPort() {
        return mainPort;
    }
}
