package Course;

public class ClassInstanciationByAndreLSVieira {

	public static void main(String[] args) {
		
		Dog  dog = new Dog();
		String Name = "Bob";
		String Breed = "Belgiun Shepherd";
		Integer Age = 5;
		String Color = "White";
		String Bark = "hauhauhau";
		String Play = "plastic bone earring";
		String Eat = "Meat and Bones";
		String Sleep = "ZZZZZZZ";
		dog.getName();
		dog.setName(Name);
		dog.getBreed();
		dog.setBreed(Breed);
		dog.getAge();
		dog.setAge(Age);
		dog.getColor();
		dog.setColor(Color);
		dog.getBark();
		dog.setBark(Bark);
		dog.getPlay();
		dog.setPlay(Play);
		dog.getEat();
		dog.setEat(Eat);
		dog.getSleep();
		dog.setSleep(Sleep);
		
		System.out.println(dog.toString());
	}

}
