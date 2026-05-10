package datingapp.models;

public class User {
    private String email;
    private String password;
    private int id;
    private Seeker seeker;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword() {
        this.password = password;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSeeker(Seeker seeker) {
        this.seeker = seeker;
    }
    public Seeker getSeeker(){
        return seeker;
    }
}
