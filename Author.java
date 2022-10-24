public class Author {
    public Author(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }

    private final String firstName;
    private final String secondName;
}