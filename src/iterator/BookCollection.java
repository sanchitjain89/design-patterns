package iterator;

// Custom collection of books
class BookCollection implements Container<Book> {
    private Book[] books;
    private int size;
    private static final int MAX_SIZE = 10;

    public BookCollection() {
        books = new Book[MAX_SIZE];
        size = 0;
    }

    public void addBook(Book book) {
        if (size < MAX_SIZE) {
            books[size] = book;
            size++;
        }
    }

    @Override
    public Iterator<Book> getIterator() {
        return new BookIterator();
    }

    // Concrete Iterator
    private class BookIterator implements Iterator<Book> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Book next() {
            if (hasNext()) {
                return books[currentIndex++];
            }
            return null;
        }

        @Override
        public void reset() {
            currentIndex = 0;
        }
    }
}
