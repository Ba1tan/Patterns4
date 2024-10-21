package CommandPattern.command;


import CommandPattern.receiver.Light;


public class DimLightsCommand implements Command {
    private Light light;

    public DimLightsCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.dim();
    }

    @Override
    public void undo() {
        light.brighten();
    }
}
