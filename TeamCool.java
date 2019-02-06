package Project00;


public class TeamCool extends Team
{
    public TeamCool(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new SchaperMember("Greg Schaper"));
        members.add(new SchaperMember("Greg Schaper"));
        members.add(new SchaperMember("Greg Schaper"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
