public class JaegerTest {

	public static void main(String[] args) {

		Jaeger jaegerOne = new Jaeger();
		Jaeger jaegerTwo = new Jaeger();

		jaegerOne.setName("Bracer Phoenix");
		jaegerOne.setWeight(2.125f);
		jaegerOne.setHeight(70.91f);
		System.out.println(jaegerOne.toString());
		jaegerOne.useWeapon();

		jaegerOne.setWeight(2.151f);
		System.out.println("JagerOne new weight " + jaegerOne.getWeight() + " tonnes");

		jaegerTwo.setName("Striker Eureka");
		jaegerTwo.setWeight(1.850f);
		jaegerTwo.setHeight(76.2f);
		System.out.println(jaegerTwo.toString());

	}

}
