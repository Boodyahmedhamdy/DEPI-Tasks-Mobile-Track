import 'Book.dart';

int countIsCheckOutBooks(List<Book> books) {
  return books.fold(0, (value, book) {
    return book.isCheckOut ? value + 1 : value;
  });
}

int totalBooksPublishedAfter(List<Book> books, int yearOfPublication) {
  return books.fold(0, (value, book) {
    if(book.yearOfPublication > yearOfPublication) return value + 1;
    else return value;
  });
}


List<Book> getBooksByAuthor(List<Book> books, String author) {
  return books.where(
      (book) => book.author == author
  ).toList();
}

