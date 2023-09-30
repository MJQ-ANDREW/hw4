package jobComputer;

import java.util.ArrayList;

public class Computer {
    private ArrayList<Component> components;
    private ComputerCompanyName ccn;

    public Computer(ComputerCompanyName ccn, ArrayList<Component> cmps) {
        this.ccn = ccn;
        this.components = cmps;
    }

    public void addComponent(Component usrt) {
        for (int i = 0; i < components.toArray().length; i++) {
            if (usrt.getComponentName().equals(components.get(i).getComponentName())) {
                components.set(i, usrt);
                return;
            }
            components.add(usrt);
        }
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public ComputerCompanyName getCcn() {
        return ccn;
    }
}
