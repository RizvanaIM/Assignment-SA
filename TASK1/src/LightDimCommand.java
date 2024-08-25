public class LightDimCommand implements Command {
    private Light light;
    private int previousLevel;
    private int newLevel;

    public LightDimCommand(Light light, int newLevel) {
        this.light = light;
        this.newLevel = newLevel;
    }

    @Override
    public void execute() {
        
        if (light instanceof KitchenRoomLight) {
            previousLevel = ((KitchenRoomLight) light).getBrightness();
        } else if (light instanceof LivingRoomLight) {
            previousLevel = ((LivingRoomLight) light).getBrightness();
        }
        light.dim(newLevel);
    }

    @Override
    public void undo() {
        light.dim(previousLevel);
    }
}