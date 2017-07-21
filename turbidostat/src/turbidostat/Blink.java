package turbidostat;

import java.util.Scanner;
import java.lang.*;
import com.pi4j.io.gpio.*;
import com.pi4j.util.CommandArgumentParser;
import com.pi4j.util.Console;

<<<<<<< HEAD
//if this comment is here, then I can push to github from NetBeans
<<<<<<< HEAD
//Just leave a comment here :D

=======
//so can I
>>>>>>> 94720f543ee41c1cd3be6c5497e041b01a9a4aa4
public class Blink {
    public static void main(String args[]) 
    throws Exception {
        System.out.println("Blink program is running. Press a key to terminate.");

	// Create a GPIO controller instance
	final GpioController gpio = GpioFactory.getInstance();	
	
	// Configure GPIO pins for output	
	GpioPinDigitalOutput ledPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_22,"dirPin",PinState.HIGH);

        /* This is a different line */
	
	while(System.in.available() == 0) {
	    System.out.print("Off...");
	    ledPin.low();
	    Thread.sleep(1000);
	    System.out.print("On...");
	    ledPin.high();
	    Thread.sleep(1000);
	}

	System.out.println("\n\nBlink program terminated.");
	
    }
}
