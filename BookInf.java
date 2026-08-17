public class BookInf {
    public static void main (String[] args){
        Book book = new Book("Стивен Кинг",2014,815,"11.22.63");
        System.out.println(book.isBig());
        System.out.println(book.estimatePrice());
        System.out.println(book.matches("Кинг"));
        System.out.println(book.matches("22"));
    }
}
