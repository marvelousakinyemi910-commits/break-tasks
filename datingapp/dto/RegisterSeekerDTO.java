package datingapp.dto;

import datingapp.models.Gender;

import java.time.LocalDate;

public class RegisterSeekerDTO{
    private  String name;
    private Gender gender;
    private LocalDate dateOfBirth;
    private String currentLocation;

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
    public void setGender(Gender gender){
        this.gender = gender;
    }

    public Gender getGender() {

        return gender;
    }
    public void setCurrentLocation(String currentLocation){

        this.currentLocation = currentLocation;
    }
    public String getCurrentLocation(){
        return currentLocation;
    }

}