package ThirtyDaysOfCode.Day13.AbstractClass;

public class MyBook extends Book {
    // Declare the price instance variable
    private int price;
    /**
     *   Class Constructor
     *
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    // Write your constructor here
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    /**
     *   Method Name: display
     *
     *   Print the title, author, and price in the specified format.
     **/
    // Write your method here
    public void display() {
        System.out.println("Title: " + super.title +
                "\nAuthor: " + super.author +
                "\nPrice: " + price);
    }

// End class
}

