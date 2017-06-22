import java.util.Scanner;
import java.lang.*;
import com.pi4j.io.gpio.*;
import com.pi4j.util.CommandArgumentParser;
import com.pi4j.util.Console;

public class StepperControl {
    public static void main(String args[]) 
    throws InterruptedException {
        System.out.println("Hello world! This is AcaiBerry!");

	// Create a GPIO controller instance
	final GpioController gpio = GpioFactory.getInstance();	
	
	// Configure GPIO pins for output	
	//GpioPinDigitalOutput testPin2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04,"stepPin",PinState.LOW);
	GpioPinDigitalOutput dirPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04,"dirPin",PinState.LOW);
	//GpioPinDigitalOutput stepPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05,"stepPin",PinState.LOW);
	int numSteps = 100;
	int pulseWidth = 20; // Microseconds
	int timeBetweenSteps = 25; // Milliseconds
	
	dirPin.high();/*
	for(int n = 0; n < numSteps; n++) {
	    stepPin.high();
	    Thread.sleep(timeBetweenSteps);
	    stepPin.low();
	    Thread.sleep(timeBetweenSteps);
	    
	}

	dirPin.low();
	for(int n = 0; n < numSteps; n++) {
	    stepPin.high();
	    Thread.sleep(timeBetweenSteps);
	    stepPin.low();
	    Thread.sleep(timeBetweenSteps);
	    
	}
	    
	*/


	Pin stepPin2 = RaspiPin.GPIO_23;
	GpioPinPwmOutput pwm = gpio.provisionPwmOutputPin(stepPin2);

        // you can optionally use these wiringPi methods to further customize the PWM generator
        // see: http://wiringpi.com/reference/raspberry-pi-specifics/
        com.pi4j.wiringpi.Gpio.pwmSetMode(com.pi4j.wiringpi.Gpio.PWM_MODE_MS);
        com.pi4j.wiringpi.Gpio.pwmSetRange(1000);
        com.pi4j.wiringpi.Gpio.pwmSetClock(500);

        // set the PWM rate to 500
	pwm.setPwm(500);
	
	Thread.sleep(10000);
	

	
    }
}
