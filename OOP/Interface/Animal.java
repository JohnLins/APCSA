// Interface
interface Animal {
    final int limbs = 4;
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class Cat implements Animal {
    public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The cat says: Meow");
    System.out.println(limbs);
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzzzz");
  }
}

