// TreeFarmingRobot.java
public class TreeFarmingRobot extends Robot implements FarmingRobot {
    public TreeFarmingRobot(String id, String name) {
        super(id, name, "Tree Farming Robot");
    }

    @Override
    public void harvest() {
        System.out.println(getName() + " is harvesting trees.");
    }

    @Override
    public void process() {
        System.out.println(getName() + " is processing harvested trees.");
    }
}
