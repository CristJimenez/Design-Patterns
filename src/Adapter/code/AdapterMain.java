package Adapter.code;

public class AdapterMain {

    public static void main(String[] args) {
        Book book;
        book = new AdapterBook(new SimpleBook("Dragon Ball", "Akira Toriyama"));
        System.out.println(book.getTitleAndAuthor());
    }
    
}
