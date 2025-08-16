public class Book {
    private static int Id = 1;
    private int bookId;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book() {
        this.bookId = Id;
        Id++;
    }
    public Book(String title, String author, double price, Publisher publisher) {
        this.bookId = Id;
        Id++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }
    public Book(String title, String author, double price) {
        this.bookId = Id;
        Id++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = new Publisher("Unknown", "Unknown");
    }

    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void displayInfo() {
        System.out.print("Mã sách: " + this.bookId + "\nTiêu đề: " + this.title + "\nTác giả: " + this.author + "\nGiá: " + this.price);
    }

    public void displayInfo(boolean showPublisher) {
        displayInfo();
        if(showPublisher)
            publisher.displayInfo();
        else
            System.out.print("\nPublisher: Unknown\n");
    }
}
