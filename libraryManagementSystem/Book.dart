class Book {
  String title;
  String author;
  int yearOfPublication;
  bool isCheckOut;

  Book({
    required this.title,
    required this.author,
    required this.yearOfPublication,
    required this.isCheckOut
  });

  Book.unknown({
    required this.title,
    required this.yearOfPublication
  }): author = "unkown", isCheckOut = false;

  factory Book.fromJson(Map<String, dynamic> json) {
    return Book(
      title: json['title'] as String,
      author: json["author"] as String,
      yearOfPublication: json["yearOfPublication"] as int,
      isCheckOut: json["isCheckOut"] as bool
    );
  }

  


}