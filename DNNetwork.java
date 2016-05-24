/** 
 *  Created by Janice Huang and Kevin Xia on May, 2016
 */

public class DNNetwork {
	private Perceptron output;
	private Perceptron [] inputs;

	public DNNetwork(int numins) {
		inputs = new Perceptron[numins];
		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = new Perceptron();
		}
		output = new Perceptron(inputs);
	}

	//TODO: train

	public double predict(double [] vals) {
		System.out.println("Predicting...");
		if (vals == null || vals.length != inputs.length) {
			System.out.printf("Error: Invalid Input");
			return 0.0;
		}
		for (int i = 0; i < inputs.length; i++) {
			inputs[i].updateValue(vals[i]);
		}
		return output.getValue();
	}
}
