package EJB;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface calculatorServiceSingletonRemote {
	
	int addLog(String str);
	List<String> getOperationLog();
}
