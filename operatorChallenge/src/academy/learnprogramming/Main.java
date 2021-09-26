package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	double variable = 20.00d;
	double variable2 = 80.00d;
	double add = (variable + variable2) * 100.00d;
	double remainder = add % 40.00d;

	boolean variable3 = remainder == 0;

	// System.out.println(remainder);

	if (!variable3) {
		System.out.println("Ops, got some remainder.");
	}

    }
}
