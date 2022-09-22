
public abstract class Sports {

    protected String name;
    protected String numberOfTeamMembers;

    public Sports() {

    }

    public Sports(String name, String numberOfTeamMembers) {
        super();
        this.name = name;
        this.numberOfTeamMembers = numberOfTeamMembers;
    }

    public abstract String getName();

    public abstract String getNumberOfTeamMembers();

}
