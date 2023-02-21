public class Lion extends Animal{
    @Override
    public void animalSound() {
        //super.animalSound();   stampa default animal sound
        System.out.println("The lion " +animalName + ": " + "grrrr");
    }
}
