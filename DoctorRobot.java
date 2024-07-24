public class DoctorRobot extends Robot implements MedicalRobot {
    public DoctorRobot(String id, String name) {
        super(id, name, "Doctor Robot");
    }

    @Override
    public void care() {
        System.out.println(getName() + " is providing medical care.");
    }
}