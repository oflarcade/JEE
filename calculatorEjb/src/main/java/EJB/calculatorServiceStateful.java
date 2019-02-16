package EJB;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class calculatorServiceStateful
 */
@Stateful
@LocalBean
public class calculatorServiceStateful implements calculatorServiceStatefulRemote, calculatorServiceStatefulLocal {

    List<String> operationLog;
    
    public calculatorServiceStateful() {
        operationLog = new ArrayList<String>();
    }

	@Override
	public void addOperationLog(String operationDetails) {
		operationLog.add(operationDetails);
	}

	@Override
	public List<String> getOperationLog() {
		// TODO Auto-generated method stub
		return operationLog;
	}

	@Override
	public float additionOperation(float a, float b) {
		addOperationLog("Addition of "+a+"+"+b+"has been executed");
		return a + b;
	}

	@Override
	public float substractionOperation(float a, float b) {
		addOperationLog("Substraction of "+a+"+"+b+"has been executed");
		return a - b;
	}

	@Override
	public float multiplicationOperation(float a, float b) {
		addOperationLog("Multiplication of "+a+"+"+b+"has been executed");
		return a * b;
	}
    
}
