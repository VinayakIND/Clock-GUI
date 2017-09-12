
package timeconversion;

import java.util.Scanner;

/**
 *
 * @author VINAYAK
 */
public class Time {
    private int hours, minutes, seconds;
    
    
    /**
     * This is the constructor 
     */
    public Time()
    {
        setTime();
    }
    
    /**
     * This is the overloaded constructor
     */
    public Time(int hours, int minutes, int seconds)
    {
        setTime(hours, minutes, seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
     
    /**
     * This method will validate the hours, min and sec entered in the UI and instantiate the instance variables 
     */
    public void setTime(int hour, int min, int sec)
    {
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hours must be between 0-23");
        if(min < 0 || min >= 60)
            throw new IllegalArgumentException("Minutes must be between 0-59");
        if(sec < 0 || sec >= 60)
            throw new IllegalArgumentException("Seconds must be between 0-59");
            
        else {
            this.hours = hour;
            this.minutes = min;
            this.seconds = sec;
        }
    }
    
    
    /**
     * This method will ask the users for hours, min and sec and will validate them
     * @param hour
     * @param min
     * @param sec 
     */
    public void setTime()
    {        
        Scanner keyboard = new Scanner(System.in);
        boolean invalidInput = true;
        
        do{
            invalidInput = true;
            System.out.printf("Please enter hours: %n");
            int hour = keyboard.nextInt();
            
            if(hour < 0 || hour >= 24)
            {    
                try
                {
                    throw new IllegalArgumentException("Hours must be between 0-23%n");
                }
                catch(IllegalArgumentException e){
                    System.err.printf(e.getMessage());
                }
            }    
            else {
                invalidInput = false;
                this.hours = hour;
            }
        }while(invalidInput == true); 
        
        do{
            invalidInput = true;
            System.out.printf("Please enter minutes: %n");
            int min = keyboard.nextInt();

            if(min < 0 || min >= 60)
            {    
                try{
                    throw new IllegalArgumentException("Minutes must be between 0-59%n");
                }
                catch(IllegalArgumentException e){
                    System.err.printf(e.getMessage());
                }
            }
            else {
                invalidInput = false;
                this.minutes = min;
            }
            
        }while(invalidInput == true);
        
        do{
            invalidInput = true;
            System.out.printf("Please enter seconds: %n");
            int sec = keyboard.nextInt();

            if(sec < 0 || sec >= 60)
            {
                try{
                    throw new IllegalArgumentException("Seconds must be between 0-59%n");
                }
                catch(IllegalArgumentException e){
                    System.err.printf(e.getMessage());
                }
            }    
            else {
                invalidInput = false;
                this.seconds = sec;
            } 
            
        }while(invalidInput == true);    
    
    }//end of the method
    
    /**
     * This method will convert the time to standard time, i.e,. in AM and PM
     */
    public String toStandardTime() 
    {
        
        /**
         *  int standardHours = hours;
            String timeDuration = "AM";
            if(hours>=12)
            {
                standardHours = 24;
                timeDuration = "PM";
                standardHours = standardHours - hours; 
            }
    
             return String.format(standardHours + ":" + this.minutes + ":" + this.seconds + " " + timeDuration);
        */
        
        return String.format("%d:%02d:%02d %s", ((hours == 0) || (hours == 12 ) ? 12 : hours%12),
                                                minutes,    
                                                seconds,
                                                (hours >=12) ? "PM" : "AM");
    }
    
    
    /**
     * This method will convert the time to military time
     */
    public String toMilitaryTime()
    {
        //String militaryTime = hours + "" + minutes + "" + seconds; 
        return String.format("%02d:%02d:%02d",hours,minutes,seconds);
        //if you take out the zero then you will get unnecessary spaces before the string 
    }
    
}//end of the Time class
    
    
    

