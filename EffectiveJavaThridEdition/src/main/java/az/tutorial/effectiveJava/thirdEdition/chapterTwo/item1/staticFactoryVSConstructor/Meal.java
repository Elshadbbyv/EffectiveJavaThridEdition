package az.tutorial.effectiveJava.thirdEdition.chapterTwo.item1.staticFactoryVSConstructor;

public class Meal {
    public String name;

    public static Meal hotMeal(String name){
        return new MerciSoup();
    }
    public static Meal coldMeal(String name){
        return new Hamburger();
    }

}
