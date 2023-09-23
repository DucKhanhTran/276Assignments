package Assignment1;

abstract class Person {
    private String Name;
    private String Email;
    private String ID;

    public Person(String Name, String Email, String StudentID) {
        this.Name = Name;
        this.Email = Email;
        this.ID = StudentID;
    }

    public String toString() {
        return "Name: " + this.Name + ". Email: " + this.Email + ". Student ID: " + this.ID;
    }
}


