// subclass of Animal
public class Pig extends Animal {

  public Pig() {
    // The super keyword is used to access superclass members in a subclass.
    super(4, "pink", false); // 4 legs, pink color, not a water animal (false)
    
    printAnimalInfo(); // this.printAnimalInfo() also works, but I'm surprised that I don't have to do that, I kind of feel uncomfortable with that freedom of choice.
  }
  
}
