/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.NotBoundException; 
import java.util.*;
/**
 *
 * @author Navneet
 */
public class CalculatorClient { 
 
    public static void main(String[] args) { 
        try { 
            Calculator c = (Calculator)
                           Naming.lookup(
                 "rmi://localhost/CalculatorService"); 

	    Scanner sc = new Scanner(System.in);	    
	    int ch=1;		   
            double val;
	while(ch!=0){
	    System.out.println("\n---Currency Convertor---\n\nSelect an option\n1.Dollar to INR 2.Yen to INR 3.Euro to INR 4.Pound to INR 5.Franc to INR\nelse 0 for exit"); 	
	    ch = sc.nextInt();
	    switch(ch){	
            case 1:
                System.out.println("Enter Amount"); 	    
	        val = sc.nextInt();
		System.out.println("**Dollar to INR**");
 		System.out.println("₹"+ c.con(val, ch) ); 
		break;
            case 2:
                System.out.println("Enter Amount"); 	    
		val = sc.nextInt();
		System.out.println("**Yen to INR**");
 		System.out.println("₹"+ c.con(val, ch) ); 
		break;
            case 3:
                System.out.println("Enter Amount"); 	    
		val = sc.nextInt();
		System.out.println("**Euro to INR**");
 		System.out.println("₹"+ c.con(val, ch) ); 
		break;
            case 4:
                System.out.println("Enter Amount"); 	    
		val = sc.nextInt();
		System.out.println("**Pound to INR**");
 		System.out.println("₹"+ c.con(val, ch) ); 
		break;
            case 5:
                System.out.println("Enter Amount"); 	    
		val = sc.nextInt();
		System.out.println("**Franc to INR**");
 		System.out.println("₹"+ c.con(val, ch) ); 
		break;
	    default:
		System.out.println("Exit");
		break;
	    }
	}
        } 
        catch (MalformedURLException murle) { 
            System.out.println(); 
            System.out.println(
              "MalformedURLException"); 
            System.out.println(murle); 
        } 
        catch (RemoteException re) { 
            System.out.println(); 
            System.out.println(
                        "RemoteException"); 
            System.out.println(re); 
        } 
        catch (NotBoundException nbe) { 
            System.out.println(); 
            System.out.println(
                       "NotBoundException"); 
            System.out.println(nbe); 
        } 
        catch (
            java.lang.ArithmeticException
                                      ae) { 
            System.out.println(); 
            System.out.println(
             "java.lang.ArithmeticException"); 
            System.out.println(ae); 
        } 
    } 
} 
