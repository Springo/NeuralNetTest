class Perceptron
{
	public double value;
	public Perceptron [] children;
	public double[] weights;
	public int numChild;
	
	public Perceptron(double input)
	{
		value = input;
		numChild = 0;
	}

	public Perceptron(double [] inputChild)
	{
		children = inputChild;
		numChild = children.length;
	}

	public Perceptron(double [] inputChild, double inputWeight)
	{
		children = inputChild;
		weights = inputWeight;
		numChild = children.length;
	}
	
	public void updateValue()
	{	
		double sum = 0;
		for (int i = 0; i < numChild; i++)
		{
			sum += children[i]*weights[i];
		}
		value = sum;
	}

	public void updateValue(double val)
	{
		value = val;
	}

	public double getValue()
	{
		return value;
	}
}
