package oop_example.book;

public class BookRunner {

    public static void main(String[] args) {

        Book artOfComputerProgramming = new Book(100);
        Book effectiveJava = new Book(50);
        Book cleanCode = new Book(40);

        artOfComputerProgramming.setNoOfCopies(100);
        effectiveJava.setNoOfCopies(50);
        cleanCode.setNoOfCopies(45);

        artOfComputerProgramming.increaseNoOfCopies(100);
        effectiveJava.increaseNoOfCopies(100);
        cleanCode.increaseNoOfCopies(100);

        artOfComputerProgramming.decreaseNoOfCopies(250);
        effectiveJava.decreaseNoOfCopies(250);
        cleanCode.decreaseNoOfCopies(250);

        System.out.println(artOfComputerProgramming.getNoOfCopies());
        System.out.println(effectiveJava.getNoOfCopies());
        System.out.println(cleanCode.getNoOfCopies());
    }
}
