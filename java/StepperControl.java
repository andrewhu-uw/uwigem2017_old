import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class StepperControl {
    public static void main(String args[]) {
        System.out.println("Hello world! This is AcaiBerry!");

	// Create a GPIO controller instance
	final GpioController gpio = GpioFactory.getInstance();

	// Configure GPIO pins for output
	GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01,"pin01",PinState.HIGH);

	


	
    }
}
