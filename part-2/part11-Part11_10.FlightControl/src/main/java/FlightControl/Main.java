package FlightControl;

import flightControl.logic.FlightControl;
import flightControl.ui.TextUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        // Write the main program here. It is useful to create some classes of your own.
        FlightControl skg = new FlightControl();
        
        TextUI thess = new TextUI(skg, scann);
        
        thess.start();

    }
}
