/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Navneet
 */
public class CalculatorImpl 
    extends 
      java.rmi.server.UnicastRemoteObject 
    implements Calculator { 
 
    // Implementations must have an 
    //explicit constructor 
    // in order to declare the 
    //RemoteException exception 
    public CalculatorImpl() 
        throws java.rmi.RemoteException { 
        super(); 
    } 
 
    public double con(double a, int b) 
        throws java.rmi.RemoteException { 
	switch(b){        
	case 1:
                System.out.println("Dollar to INR");
		return a*65.01; 
	case 2:
                System.out.println("Yen to INR");
		return a*0.62; 
	case 3:
                System.out.println("Euro to INR");
		return a*80.34; 
	case 4:
                System.out.println("Pound to INR");
		return a*91.91; 
	case 5:
                System.out.println("Franc to INR");
		return a*68.70; 
	default:
		break;
	}
	return 0;
    } 
 
} 
