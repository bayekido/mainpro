class Rental {
    private Book book;
    private Person person;
    String date;

    public Rental(Book book, Person person) {
        this.book = book;
        this.person = person;

    }

    public Book getBook() {
        return book;
    }

    public Person getPerson() {
        return person;
    }

    public void setBook(Book book) {
    }
}
