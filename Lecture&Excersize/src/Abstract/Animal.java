package Abstract;

 abstract class Animal {
	 //abstarct method does not have method
	 public abstract void animalSound();
	 //normal method
	 public void sleep() {
		 System.out.println("Zzzz");
	 }
	 class Pig extends Animal{
		 public void animalSound() {
			 System.out.println("The pig called : wee wee");
		 }
	 }
	 class MainClass{
		 public static void main(String[] args) {
			 Pig myPig= new Pig();
			 myPig.animalSound();
			 myPig.sleep();
			 
		 }
	 }

}
