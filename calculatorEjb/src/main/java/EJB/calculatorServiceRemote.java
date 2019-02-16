package EJB;

import javax.ejb.Remote;

@Remote
public interface calculatorServiceRemote {
	float addition(float a, float b);
	float subsctraction(float a, float b);
	float multiplication(float a, float b);
}
