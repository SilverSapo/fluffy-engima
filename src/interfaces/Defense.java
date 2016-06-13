package interfaces;

public interface Defense {
	
	int getStrength();
	boolean isBreached();
	String getType();
	void breach();
	void reset();

}
