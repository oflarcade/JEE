package EJB;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class calculatorService
 */
@Stateless
@LocalBean
public class calculatorService implements calculatorServiceRemote, calculatorServiceLocal {

    /**
     * Default constructor. 
     */
    public calculatorService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public float addition(float a, float b) {
		// TODO Auto-generated method stub
		return a + b ;
	}

	@Override
	public float subsctraction(float a, float b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public float multiplication(float a, float b) {
		// TODO Auto-generated method stub
		return a * b;
	}

}
