package az.tutorial.effectiveJava.thirdEdition.chapterTwo.item1.staticFactoryVSConstructor;

public class Arsenal {
    private String newPlayer;
    private int age;

    public Arsenal(String newPlayer, int age) {
        this.newPlayer = newPlayer;
        this.age = age;
    }
    public Arsenal(String newCoachPlayer) {
        this.newPlayer = newPlayer;
        this.age = age;
    }
    public static Arsenal newPlayerCreate(String newPlayer){
        return new Arsenal(newPlayer, 36);
    }
}
