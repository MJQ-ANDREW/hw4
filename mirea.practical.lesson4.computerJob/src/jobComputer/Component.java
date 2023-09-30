package jobComputer;

public abstract class Component {
    private float height;
    private float width;
    private float depth;
    protected String componentName;
    private float energyConsumption;

    public Component(float h, float w, float d, float ec){
        this.height = h;
        this.width = w;
        this.depth = d;
        this.energyConsumption = ec;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getDepth() {
        return depth;
    }

    public String getComponentName() {
        return componentName;
    }

    public float getEnergyConsumption() {
        return energyConsumption;
    }
}
