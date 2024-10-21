package CommandPattern;

import CommandPattern.command.TurnTVOnCommand;
import CommandPattern.command.DimLightsCommand;
import CommandPattern.invoker.RemoteControl;
import CommandPattern.receiver.TV;
import CommandPattern.receiver.Light;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(2);
        TV tv = new TV();
        Light light = new Light();

        remote.setCommand(0, new TurnTVOnCommand(tv));
        remote.setCommand(1, new DimLightsCommand(light));

        remote.pressButton(0);
        remote.pressUndo();

        remote.pressButton(1);
        remote.pressUndo();
    }
}
