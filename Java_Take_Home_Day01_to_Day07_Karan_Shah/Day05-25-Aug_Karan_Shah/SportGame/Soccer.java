
public class Soccer extends Sports{

    public Soccer() {
    }

    public Soccer(String name, String numberOfTeamMembers) {
        super(name, numberOfTeamMembers);
    }

    @Override
    public String getName() {
        return "soccer";
    }

    @Override
    public String getNumberOfTeamMembers() {
        return "In Soccer, each team has 11 players.";
    }
}
