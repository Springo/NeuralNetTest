class Perceptron
{
	private double value;
	private Perceptron [] children;
	private double[] weights;
	private int numChild;
	private double intercept;
	
	public Perceptron()
	{
		value = 0.0;
		numChild = 0;
		intercept =0;
	}

	public Perceptron(double input)
	{
		value = input;
		numChild = 0;
		intercept =0;
	}

	public Perceptron(Perceptron [] inputChild)
	{
		children = inputChild;
		numChild = children.length;
		weights = new double[numChild];
		for (int i = 0; i < numChild; i++)
			weights[i] = 1;
		intercept =0;
	}

	public Perceptron(Perceptron [] inputChild, double [] inputWeight)
	{
		children = inputChild;
		weights = inputWeight;
		numChild = children.length;
		intercept =0;
	}
	
	public void updateValue()
	{	
		if (numChild == 0)
			return;
		double sum = 0;
		for (int i = 0; i < numChild; i++)
		{
			sum += children[i].getValue()*weights[i];
		}
		value = sum;
	}

	public void updateValue(double val)
	{
		value = val;
	}

	public double getValue()
	{
		updateValue();
		return value;
	}

	public void setWeight(int child, double val)
	{
		weights[child] = val;
	}
}
