package EJB;

import javax.ejb.Remote;
import java.util.List;


@Remote
public interface calculatorServiceStatefulRemote {
  float additionOperation(float a, float b);
  float substractionOperation(float a, float b);
  float multiplicationOperation(float a, float b);
  void addOperationLog(String operationDetails);
  List<String> getOperationLog();
}
