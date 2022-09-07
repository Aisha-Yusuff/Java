package Clock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Clock {
    // Use constant - ANSI escape codes to colour output string
    public static final String ANSI_RED = "\u001B[31m";
    // Use constant - ANSI escape codes to reset the colour of output
    public static final String ANSI_RESET = "\u001B[0m";
    
    // Create main method
    public static void main(String[] args) {
        // Use Local Date Time library to get the current time
        LocalDateTime dateTime = LocalDateTime.now();
        // Format the time object into a specific pattern 
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

        // Extract only the time from current date and format it 
        String formattedTime = dateTime.format(dtf);
        // Print string with the current time and print only "time" red
        System.out.printf("The current " + ANSI_RED + "time" + ANSI_RESET + " is %s \n", formattedTime); 
    }
}