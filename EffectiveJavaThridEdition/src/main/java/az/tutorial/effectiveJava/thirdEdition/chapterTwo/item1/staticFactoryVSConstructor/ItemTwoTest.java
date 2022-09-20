package az.tutorial.effectiveJava.thirdEdition.chapterTwo.item1.staticFactoryVSConstructor;

public class ItemTwoTest {
    Arsenal arsenal = new Arsenal("Ronaldo",37);
    // if you want to const value of age
    Arsenal arsenal1 = Arsenal.newPlayerCreate("Ronaldo");
    //Override Problem if you use Construct/ new
    Arsenal arsenal2 = new Arsenal("arteta");

}
