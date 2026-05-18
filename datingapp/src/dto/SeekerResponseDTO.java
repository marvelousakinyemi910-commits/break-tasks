package dto;

public class SeekerResponseDTO {
    private int id;
    private String name;
    private String currentLocation;


    public int getId() {

        return id;
    }
    public void setId(int id){

        this.id = id;
    }
    public void setName(String name){

        this.name = name;
    }
    public String getName(){

        return name;
    }
    public String getCurrentLocation(){

        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {

        this.currentLocation = currentLocation;
    }
}