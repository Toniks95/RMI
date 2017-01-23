package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DetRMI extends Remote {
    public double determinant(double [][] table) throws RemoteException;
    
}
