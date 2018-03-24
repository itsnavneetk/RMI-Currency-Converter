/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Navneet
 */
public interface Calculator 
          extends java.rmi.Remote { 
    public double con(double a, int b) 
        throws java.rmi.RemoteException; 
 
} 

