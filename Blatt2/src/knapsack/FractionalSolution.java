package knapsack;

/**
 * Solution of a fractional knapsack problem
 *
 * @author Stephan Beyer
 */
public class FractionalSolution extends GenericSolution<Double> {
	private double epsilon = 1e-6;

	public FractionalSolution(Instance instance) {
		super(instance);
	}

	/**
	 * Copy a solution (copy constructor)
	 */
	public FractionalSolution(FractionalSolution solution) {
		super(solution);
	}

	@Override
	public void set(int item, Double quantity) {
	}

	@Override
	public boolean isFeasible() {
	}

	@Override
	public boolean isBinary() {
		for (double quantity : sol) {
			if (quantity > epsilon
			 && quantity < 1 - epsilon) {
				return false;
			}
		}
		return true;
	}

	@Override
	protected Double zero() {
		return 0.0;
	}
}
