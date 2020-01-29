import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}
		
		// write your code here

		// finds endpoints
		int lastIndexA = a.size();
		int lastIndexB = b.size();

		if (a.get(0) == b.get(0)) { // compares first value
			return true;
		} else if (a.get(lastIndexA - 1) == b.get(lastIndexB - 1)) { // compares last value
			return true;
		} else {
			return false;
		}
		
		// return false;	// default return value to ensure compilation
	}
	
	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		// write your code here

		ArrayList<String> empty = new ArrayList<String>(); // empty string to return

		// check that conditions are met
		if (values == null || values.size() < n || n < 0) {
			return empty;
		}

		// initialize output array + other things
		ArrayList<String> result = new ArrayList<>();
		int length = values.size();
		int index = n;

		// append first n elements
		for (int i = 0; i < n; i++) {
			result.add(values.get(i));
		}

		// append last n elements
		for (int j = n; j < 2 * n; j++) {
			result.add(values.get(length-index));
			index--;
		}

		return result;
		
		// return null;	// default return value to ensure compilation
	}
	
	public int difference(ArrayList<Integer> numbers) {
		// write your code here

		// check that conditions are met
		if (numbers == null || numbers.size() < 1) {
			return -1;
		}

		// initialize net largest and net smallest vars
		int largest = numbers.get(0);
		int smallest = numbers.get(0);

		// goes through values, replaces largest or smallest as needed
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > largest) {
				largest = numbers.get(i);
			}
			if (numbers.get(i) < smallest) {
				smallest = numbers.get(i);
			}
		}

		// compute and return difference
		int difference = largest - smallest;
		return difference;
		
		// return -1;		// default return value to ensure compilation
	}
	
	public double biggest(ArrayList<Double> numbers) {
		// write your code here

		// check that conditions are met
		if (numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0) {
			return -1;
		}

		// check that no negatives condition is met
		boolean noNegatives = true;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < 0) {
				noNegatives = false;
			}
		}
		if (!noNegatives) {
			return -1;
		}

		// initialize variables
		double largest = numbers.get(0);
		int middleIndex = numbers.size() / 2;
		int finalIndex = numbers.size() - 1;

		// finds if middle or final numbers are largest
		if (numbers.get(middleIndex) > largest) {
			largest = numbers.get(middleIndex);
		}
		if (numbers.get(finalIndex) > largest) {
			largest = numbers.get(finalIndex);
		}

		return largest;
		
		// return -1;		// default return value to ensure compilation
	}
	
	//broken
	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here
		
		ArrayList<String> empty = new ArrayList<String>(); // empty string to return

		// check that conditions are met
		if (values == null || values.size() < 3 || values.size() % 2 == 0) {
			return empty;
		}

		// check that no null condition is met
		boolean containsNull = false;
		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) == null) {
				containsNull = true;
			}
		}
		if (containsNull) {
			return empty;
		}

		// finds middle 3 elements
		int middleIndex = values.size() / 2;
		int firstIndex = middleIndex - 1;
		int lastIndex = middleIndex + 1;

		// String[] result = { values[firstIndex], values[middleIndex], values[lastIndex] };
		ArrayList<String> result = new ArrayList<String>();
		result.add(values.get(firstIndex));
		result.add(values.get(middleIndex));
		result.add(values.get(lastIndex));

		return result;

		// return null;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here

		// checks that conditions are met
		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		// initialize sequence vars
		int lowestNum = numbers.get(0);
		int middleNum = numbers.get(1);
		int finalNum = numbers.get(2);

		// iterates through array for increasing sequences
		for (int i = 0; i < numbers.size(); i++) {
			if (lowestNum < middleNum && middleNum < finalNum) {
				return true;
			}

			if (i + 2 < numbers.size()) {
				lowestNum = numbers.get(i);
				middleNum = numbers.get(i + 1);
				finalNum = numbers.get(i + 2);
			} else {
				return false;
			}

		}
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(ArrayList<String> values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
