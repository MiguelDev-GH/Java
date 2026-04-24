public class ProfessionalParticipant extends Participant {
    private String organization;

    public ProfessionalParticipant(String id, String fullName, String email, String organization) {
        super(id, fullName, email);
        this.organization = organization;
    }

    @Override
    public String describeRole() {
        return "Professional from " + organization;
    }

    @Override
    public String toString() {
        return "Participant: " + getFullName() + " (" + getEmail() + ") - ID: " + getId();
    }
}
