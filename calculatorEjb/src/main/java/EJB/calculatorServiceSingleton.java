package EJB;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

/**
 * Session Bean implementation class calcultorServiceSingleton
 */
@Singleton
@LocalBean
public class calculatorServiceSingleton implements calculatorServiceSingletonRemote, calculatorServiceSingletonLocal {

	private List<String> operationLog = new ArrayList<String>();
    /**
     * Default constructor. 
     */
    public calculatorServiceSingleton() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int addLog(String str) {
		
		this.operationLog.add(str);
		return operationLog.size();
	}

	@Override
	public List<String> getOperationLog() {
		// TODO Auto-generated method stub
		return this.operationLog;
	}
	
	@PostConstruct
	public void depolymentLog(){
		System.out.println("Singleton been has been constructed...");
	}
	
	
    
    

}
