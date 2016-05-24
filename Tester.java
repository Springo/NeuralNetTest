public class Tester {
	public static void main(String [] args) {
		DNNetwork test = new DNNetwork(4);
		double [] inputs = {2,3,4,5};
		System.out.println(test.predict(inputs));
	}
}
