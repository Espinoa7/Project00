package Project00;

import java.util.ArrayList;


public class Course
{
    ArrayList<Team> teams = new ArrayList<>();

    public Course()
    {

    }


    public void printCourseMembers()
    {
        for(int i = 0; i < teams.size(); i++)
        {
            System.out.println(teams.get(i).getTeamName());
            teams.get(i).printTeamMembers();
            System.out.println("\n");
        }
    }


    public void createTeams()
    {
        teams.add(new TeamCool("TeamCool"));
        teams.add(new TeamCool("TeamNice"));
        teams.add(new TeamArachibutyrophobia("TeamArachibutyrophobia"));
        teams.add(new TeamNice("TeamNice"));
        teams.add(new TeamFive("TeamFive"));
        // create each new team and add to team list;
        // Repository owner will do this.
    }

}

