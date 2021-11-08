package java_enums;

public class Main {
	public static void main(String[] args) {
		printMyEnum();
	}

	private static void printMyEnum() {
		for (DataTypes dataType : DataTypes.values()) {
			System.out.println(dataType + ": " + dataType.name);
		}
	}
}
