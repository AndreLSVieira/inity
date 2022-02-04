package Course;

public class Dog {
	private String name;
	private String breed;
	private Integer age;
	private String color;
	private String bark;
	private String play;
	private String eat;
	private String sleep;

	public Dog() {
	}

	public Dog(String name, String breed, Integer age, String color, String bark, String play, String eat,
			String sleep) {
		this.name = name;
		this.breed = breed;
		this.age = 5;
		this.color = color;
		this.bark = bark;
		this.play = play;
		this.eat = eat;
		this.sleep = sleep;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBark() {
		return bark;
	}

	public void setBark(String bark) {
		this.bark = bark;
	}

	public String getPlay() {
		return play;
	}

	public void setPlay(String play) {
		this.play = play;
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public String getSleep() {
		return sleep;
	}

	public void setSleep(String sleep) {
		this.sleep = sleep;
	}

	public String toString() {
		return ("Hi, my name is " + name + "\nI'M of the " + breed + " Breed" + "\nMy age is " + age
				+ "\n& My color is " + color + "\nDo you know what my favorite things I like to do?\n"
				+ "I like to bark " + bark + "\n" + "I like to play whith " + play + " \n" + "I like to eat " + eat
				+ "\nAnd I like to sleep " + sleep);
	}

}
