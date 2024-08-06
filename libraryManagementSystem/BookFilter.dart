import 'Book.dart';

typedef BookFilter = bool Function(Book book);

List<Book> filterBook(List<Book> books, BookFilter filter) {
  List<Book> result = [];
  books.forEach(
      (book) {
        if(filter(book)) result.add(book);
      }
  );
  return result;
}

