package EJB;

import javax.ejb.Local;

@Local
public interface calculatorServiceLocal {
	float addition(float a, float b);
	float subsctraction(float a, float b);
	float multiplication(float a, float b);
}
