public class GetBook {
    public static void main(String[] args) {

        Book book = Book.of("Isaac Asimov", "The Galaxy");
        Book book1 = book.of("Adam Mickiewicz", "Pan Tadeusz");

    }
}