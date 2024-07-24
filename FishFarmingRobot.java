// FishFarmingRobot.java
public class FishFarmingRobot extends Robot implements FarmingRobot {
    public FishFarmingRobot(String id, String name) {
        super(id, name, "Fish Farming Robot");
    }

    @Override
    public void harvest() {
        System.out.println(getName() + " is harvesting fish.");
    }

    @Override
    public void process() {
        System.out.println(getName() + " is processing harvested fish.");
    }
}
