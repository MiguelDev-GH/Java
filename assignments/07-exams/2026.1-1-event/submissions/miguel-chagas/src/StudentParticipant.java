public class StudentParticipant extends Participant {
    private String course;
    private int currentSemester;

    public StudentParticipant(String id, String fullName, String email, String course, int currentSemester) {
        super(id, fullName, email);
        this.course = course;
        this.currentSemester = currentSemester;
    }

    @Override
    public String describeRole() {
        return "Student in " + course + " (" + currentSemester + "th semester)";
    }

    @Override
    public String toString() {
        return "Participant: " + getFullName() + " (" + getEmail() + ") - ID: " + getId();
    }
}
