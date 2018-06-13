package aca.unit.test;

public class ShapeUtils {

	public ShapeUtils() {

	}

	public boolean isTriangle(double x, double y, double z) {
		if (isLengthOk(x) && isLengthOk(y) && isLengthOk(z)) {
			if ((x + y > z) && (x + z > y) && (y + z > x)) {
				return true;
			}
		}

		return false;
	}

	private boolean isLengthOk(double length) throws IllegalArgumentException {
		if (length > 0) {
			return true;
		} else {
			throw new IllegalArgumentException("Triangle side length must be greater than 0.");
		}
	}
}
