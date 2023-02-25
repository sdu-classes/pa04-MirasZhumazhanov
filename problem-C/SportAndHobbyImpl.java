public class SportAndHobbyImpl implements PersonInterface, HobbyInterface, SportInterface {
    private String name;
    private int myAge;
    private String hobby;
    private String sportName;
    private int theCostToPlayThisSport;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int myAge) {
        this.myAge = myAge;
    }

    @Override
    public String whatIsMyHobby() {
        return hobby;
    }

    @Override
    public void setMyHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String getMyFavoriteSport() {
        return sportName;
    }

    @Override
    public void setMyFavoriteSport(String sportName) {
        this.sportName = sportName;
    }

    @Override
    public int howMuchItCostToPlayThisSport() {
        this.theCostToPlayThisSport = this.myAge * 10;
        return this.theCostToPlayThisSport;
    }
}