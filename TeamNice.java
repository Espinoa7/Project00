package Project00;

import java.util.*;
import Project00.Team;
import Project00.Member;
import Project00.GooberMember;


public class TeamNice extends Team
{
    public TeamNice(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new GooberMember("Goober"));
        members.add(new GooberMember("Andy"));
        members.add(new GooberMember("Gomer"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
