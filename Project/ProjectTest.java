public class ProjectTest {
    public static void main(String[] args) {

        Project p = new Project();
        p.elevatorPitch("name",  "description");
        System.out.println(p.elevatorPitch("name", "description"));

        Project p2 = new Project("Bisi");
        p2.elevatorPitch("name", "description");
        System.out.println(p2.elevatorPitch("name", "description"));

        Project p3 = new Project("Bisi", "Tall");
        p3.elevatorPitch("name", "description");
        System.out.println(p3.elevatorPitch("name", "description"));

        Project p4 = new Project("Bisi", 1000.0,  "Tall");
        p4.elevatorPitch("name", "description");
        System.out.println(p4.elevatorPitch("name", "description"));

        

    }
}