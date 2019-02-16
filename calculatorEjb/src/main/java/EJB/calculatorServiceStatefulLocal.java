package EJB;

import javax.ejb.Local;
import java.util.List;

@Local
public interface calculatorServiceStatefulLocal {
	void addOperationLog(String operationDetails);
	List<String> getOperationLog();
}
