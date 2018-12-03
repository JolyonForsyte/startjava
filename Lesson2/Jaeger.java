public class Jaeger {

	private String name;
	private float height;
	private float weight;

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	void useWeapon() {
		System.out.println("Using cannons");
	}

	void move() {

	}

	@Override
	public String toString() {
		return "Jaeger [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}

}
