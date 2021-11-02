// superclass
public class Animal {
  
  private int legs;
  private String color;
  private boolean waterAnimal;

  // constructor
  public Animal(int legs, String color, boolean waterAnimal) {
    this.legs = legs;
    this.color = color;
    this.waterAnimal = waterAnimal;
  }

  public int getLegsCount() {
    return this.legs;
  }

  public String getColor() {
    return this.color;
  }

  public boolean isWaterAnimal() {
    return this.waterAnimal;
  }

  public void printAnimalInfo() {
    System.out.println("The animal has " + legs + " legs, it's colour is " + color + " and it's water status is " + waterAnimal + ".");
  }
}
