package com.host;
import gnu.io.*; // RXTX
// import javax.comm.*; // SUN
import java.util.Enumeration;


public class ErsteSchritte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program started");
		
		//System.out.println(java.library.path);
	    CommPortIdentifier serialPortId;
	    //static CommPortIdentifier sSerialPortId;
	    Enumeration enumComm;
	    //SerialPort serialPort;

	    enumComm = CommPortIdentifier.getPortIdentifiers();
	    while (enumComm.hasMoreElements()) {
	     	serialPortId = (CommPortIdentifier) enumComm.nextElement();
	     	if(serialPortId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
	    		System.out.println(serialPortId.getName());
	    	}
	    }

		System.out.println("Finished successfully");
	}
}