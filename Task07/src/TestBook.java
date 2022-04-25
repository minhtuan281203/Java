public class TestBook {
    public static void main(String[] args) {
    Author tea = new Author("December", "december@gmail.com", 'm');
        System.out.println(tea);
    Book b1 = new Book("Java", tea, 9.2, 99);
        System.out.println(b1);

    //Using Author => create a new book
    Book moreb1 = new Book("new name book", new Author("January", "t1@gmail.com", 'f'), 10.05, 8);
        System.out.println(moreb1);
    }
}
