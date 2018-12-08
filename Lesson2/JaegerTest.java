public class JaegerTest {
	public static void main(String[] args) {
		Jaeger bracer = new Jaeger("Bracer Phoenix", 70.91f, 2.125f);
		bracer.setWeight(2.147f);
		System.out.println(bracer.toString());
		
		Jaeger striker = new Jaeger("Striker Eureka",76.2f,1.850f);
		System.out.println(striker.toString());
		/*
		Jaeger bracer = new Jaeger();
		bracer.setName("Bracer Phoenix");
		bracer.setWeight(2.125f);
		bracer.setHeight(70.91f);
		System.out.println(bracer.toString());
		bracer.useWeapon();
		bracer.setWeight(2.151f);
		System.out.println("JagerOne new weight " + bracer.getWeight() + " tonnes");

		Jaeger striker = new Jaeger();
		striker.setName("Striker Eureka");
		striker.setWeight(1.850f);
		striker.setHeight(76.2f);
		System.out.println(striker.toString());
		*/
	}
}
