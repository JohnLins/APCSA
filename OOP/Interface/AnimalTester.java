class AnimalTester {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
    
    Cat myCat = new Cat();
    myCat.animalSound();
    myCat.sleep();
  }
}