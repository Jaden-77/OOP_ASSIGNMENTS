/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author User
 */
public class myTime {
   public int hours;
   public int minutes;
   public int seconds;
   public boolean meridean;
    
    public myTime(int hours, int minutes, int seconds, boolean meridean) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.meridean = meridean;
    }

     public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isMeridean() {
        return meridean;
    }

    // Setter methods
    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setMeridean(boolean meridean) {
        this.meridean = meridean;
    }

    
    public void advanceTime(int seconds) {
        int totalSeconds = this.seconds + seconds;
        int additionalMinutes = totalSeconds / 60;
        totalSeconds %= 60;
        
        int totalMinutes = this.minutes + additionalMinutes;
        int additionalHours = totalMinutes / 60;
        totalMinutes %= 60;
        
        int totalHours = this.hours + additionalHours;
        totalHours %= 12;
        
        if (totalHours == 0) {
            totalHours = 12;
            this.meridean = !this.meridean;
        }
        
        this.hours = totalHours;
        this.minutes = totalMinutes;
        this.seconds = totalSeconds;
    }
    
    public void tickBySecond() {
        this.seconds++;
        if (this.seconds >= 60) {
            this.seconds = 0;
            this.minutes++;
            if (this.minutes >= 60) {
                this.minutes = 0;
                this.hours++;
                if (this.hours >= 12) {
                    this.hours = 0;
                    this.meridean = !this.meridean;
                }
            }
        }
    }
    
public void tickByMinutes() {
        this.minutes++;
        if (this.minutes >= 60) {
            this.minutes = 0;
            this.hours++;
            if (this.hours >= 12) {
                this.hours = 0;
                this.meridean = !this.meridean;
            }
        }
    }
    
    public void tickByHour() {
        this.hours++;
        this.hours %= 12;
        if (this.hours == 0) {
            this.hours = 12;
            this.meridean = !this.meridean;
        }
    }
    
    public void displayTime12() {
        String meridian = this.meridean ? "AM" : "PM";
        System.out.printf("%02d:%02d:%02d %s%n", this.hours, this.minutes, this.seconds, meridian);
    }
    
    public void displayTime24() {
        System.out.printf("%02d:%02d:%02d%n", this.hours, this.minutes, this.seconds);
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", this.hours, this.minutes, this.seconds,
                this.meridean ? "AM" : "PM");
    }
}
