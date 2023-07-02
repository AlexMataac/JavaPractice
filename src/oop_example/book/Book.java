package oop_example.book;

public class Book {

    public Book(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    private int noOfCopies;

    void setNoOfCopies(int noOfCopies) {
        if (noOfCopies > 0)
        this.noOfCopies = noOfCopies;
    }

    public void increaseNoOfCopies(int howMuch) {
        setNoOfCopies(this.noOfCopies + howMuch);
    }

    public void decreaseNoOfCopies(int howMuch) {
        setNoOfCopies(this.noOfCopies - howMuch);
    }
}
