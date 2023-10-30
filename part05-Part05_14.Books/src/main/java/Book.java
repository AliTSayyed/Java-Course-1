
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared) {
        // if objects have the same location in memeory, primitive check
        if (this == compared) {
            return true;
        }
        // if the compared object isnt the same object they are not equal
        if (!(compared instanceof Book)) {
            return false;
        }
        // convert object to a bird object using typecast adn give it a new variable name
        Book comparedObject = (Book) compared;

        // now check the values of the two objects (of same type)
        if (this.name.equals(comparedObject.getName()) && this.publicationYear == comparedObject.getPublicationYear()) {
            return true;
        }
        return false;
    }

}
