public class Team {
    Member member;
    public Team(Member member) {
        this.member = member;
    }

    public static void main(String[] args) {
        Member member = new Member("Sasha", "Programmer", 10, 20);
        Team myTeam = new Team(member);
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getRank());
    }

}

class Member {
    private String name;
    private String type;
    private int level;
    private int rank;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getRank() {
        return rank;
    }

    public Member(String name, String type, int level, int rank) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    }
}
