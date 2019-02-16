package calculatorClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javax.naming.*;
import EJB.calculatorServiceSingletonRemote;

public class calculator {
	   static BufferedReader brConsoleReader = null; 

	public static void main(String[] args) throws NamingException {
		
		//statefulTester();
		String jndiName = "calculatorEjb/calculatorServiceSingleton!EJB.calculatorServiceSingletonRemote";
		Context context = new InitialContext();
		calculatorServiceSingletonRemote proxy = (calculatorServiceSingletonRemote) context.lookup(jndiName);
		
		System.out.println("operation log size : "+proxy.addLog("new operation has been logged!"));
		//calculatorServiceStatefulRemote  statfulProxy = (calculatorServiceStatefulRemote) context.lookup(jndiName);
		List<String> operationLog = proxy.getOperationLog();
		int i = 0;
			for(String log:operationLog){
				System.out.println("log number"+i+":"+log );
				i++;
			}
		/*System.out.println("addition of 2 numbers : "+proxy.addition(1, 2));
		System.out.println("multiplication of 2 numbers : "+proxy.multiplication(2, 2));
		System.out.println("substraction of 2 numbers : "+proxy.subsctraction(1, 2));*/
	}
	
	private static void showGUI() {
	      System.out.println("**********************");
	      System.out.println("Welcome to Calculator (Stateful)");
	      System.out.println("**********************");
	      System.out.print("Options \n1. Add Operation\n2. Substract Operation\n3. Multiplication Operation\n4. Exit \nEnter Choice: ");
	   }
	
	/*private static void statefulTester() throws NamingException{
		int choice;
	    Scanner scanner = new Scanner(System.in);
	    String jndiName= "calculatorEjb/calculatorServiceStateful!EJB.calculatorServiceStatefulRemote";
		Context context = new InitialContext();
	    calculatorServiceStatefulRemote  statefulProxy = (calculatorServiceStatefulRemote) context.lookup(jndiName);
		try{
			showGUI();
			choice = scanner.nextInt();
			while (choice != 4) {
	            float a;
	            float b;
	            
	            //String strChoice = brConsoleReader.readLine();
	            //choice = Integer.parseInt(strChoice);
	            if (choice == 1) {
	               System.out.print("Enter first variable: ");
	               a = scanner.nextFloat();
	               System.out.print("Enter second variable: ");
	               b= scanner.nextFloat();
	               statefulProxy.additionOperation(a, b);
	               System.out.print("do you want to continue ?(Y/n)");
	               String res = scanner.nextLine();
	               if(res == "y" || res == "Y"){
	            	   showGUI();
	       			  choice = scanner.nextInt();
	               } else {
	            	   	choice = 4;
	               }
	               
	            } else if (choice == 2) {
	            	System.out.print("Enter first variable: ");
		              a = scanner.nextFloat();
		              System.out.print("Enter second variable: ");
		              b= scanner.nextFloat();
		              statefulProxy.substractionOperation(a, b);
		              
	            } else if (choice == 3){
	            	System.out.print("Enter first variable: ");
		               a = scanner.nextFloat();
		               System.out.print("Enter second variable: ");
		               b= scanner.nextFloat();
		               statefulProxy.multiplicationOperation(a, b);
		               System.out.print("do you want to continue ?(Y/n)");
		               String res = scanner.nextLine();
		               if(res == "y" || res == "Y"){
		            	   showGUI();
		       			  choice = scanner.nextInt();
		               } else {
		            	   	choice = 4;
		               }
	            }
	         }
			
			List<String> operationLog = statefulProxy.getOperationLog();
			System.out.println("operation(s) entered so far: " + operationLog.size());
	         int i = 0;
	         for (String operation:operationLog) {
	            System.out.println((i+1)+". " + operation);
	            i++;
	         }       
		}catch(Exception e){
			System.out.println(e.getMessage());
	         e.printStackTrace();
		}
		
	}
	  
	*/

}
