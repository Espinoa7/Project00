package Project00;

public class TeamArachibutyrophobia extends Team {

    public TeamArachibutyrophobia(String name) {
        super(name);
        createTeamMembers();

    }

    @Override
    public void createTeamMembers() {

        members.add(new WillyMember("Willy Brandes"));

    }

}
