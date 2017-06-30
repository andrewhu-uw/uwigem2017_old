import java.util.Scanner;
import java.lang.*;
import com.pi4j.io.gpio.*;
import com.pi4j.util.CommandArgumentParser;
import com.pi4j.util.Console;

public class Blink {
    public static void main(String args[]) 
    throws InterruptedException {
        System.out.println("Hello world! This is AcaiBerry!");

	// Create a GPIO controller instance
	final GpioController gpio = GpioFactory.getInstance();	
	
	// Configure GPIO pins for output	
	GpioPinDigitalOutput ledPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_24,"dirPin",PinState.LOW);

	ledPin.high();
	
	while(true) {
	Thread.sleep(1000);
	ledPin.low();
	Thread.sleep(1000);
	ledPin.high();
	
	}
	
    }
}
