package dto;

import java.time.LocalDate;

public class SeekerDTO {
    private String name;
    private LocalDate dateOfBirth;
    private String currentLocation;
    private int heightInCM;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setCurrentLocation(String currentLocation){
        this.currentLocation = currentLocation;
    }
}
