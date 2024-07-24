public class NurseRobot {
    public NurseRobot(String id, String name) {
        super(id, name, "Nurse Robot");
    }

    @Override
    public void care() {
        System.out.println(getName() + " is providing nursing care.");
    }
}
