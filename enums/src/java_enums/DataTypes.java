package java_enums;

public enum DataTypes {
	INT("Integer"), 
	FLOAT("Float"),
	STRING("String"), 
	DOUBLE("Double"),
	BYTE("Byte"),
	SHORT("Short"),
	LIST("List"),
	HASHMAP("HashMap");
	
	public String name;
	
	// we can have as many arguements as we want
	private DataTypes(String name) {
		this.name = name;
	}
}
