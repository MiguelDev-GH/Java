import java.util.ArrayList;

public class EventApp {
    public static void main(String[] args) {
        ArrayList<Participant> participants = new ArrayList<>();

        participants.add(new StudentParticipant("S1", "Miguel Chagas", "miguel@example.com", "Computer Science", 3));
        participants.add(new StudentParticipant("S2", "Joao Silva", "joao@example.com", "Engineering", 1));
        participants.add(new ProfessionalParticipant("P1", "Dr. Smith", "smith@tech.com", "Google"));
        participants.add(new ProfessionalParticipant("P2", "Jane Doe", "jane@corp.com", "Microsoft"));

        for (Participant p : participants) {
            System.out.println(p.toString());
            System.out.println("Role: " + p.describeRole());
            System.out.println();
        }
    }
}
