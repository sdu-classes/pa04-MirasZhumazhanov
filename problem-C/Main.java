public class Main {
    public static void main(String[] args) {
        SportAndHobbyImpl s = new SportAndHobbyImpl();
        s.setName("Miras");
        s.setAge(20);
        s.setMyFavoriteSport("Judo");
        s.setMyHobby("Guitar");

        System.out.println(s.getMyFavoriteSport());
        System.out.println(s.whatIsMyHobby());
        System.out.println(s.howMuchItCostToPlayThisSport());
    }
}
