public class Cow extends Animal{
    @Override
    public void animalSound() {
        //super.animalSound();   stampa defaault animal sound
        System.out.println("The cow " +animalName + ": " + "muuuu");
    }
}