package model;

public class Book {
    private String bookID;
    private String title;
    private String authorID;
    private String publisherID;
    private int PublishedYear;
    private String categoryID;
    private String genreID;
    private String status;
}
/*
Categories (Danh mục):
Categories là cách chia sách thành các nhóm lớn dựa trên các tiêu chí chung như đối tượng đọc, địa điểm,
hoặc loại hình xuất bản. Các danh mục thường được sử dụng để giúp người đọc dễ dàng tìm kiếm sách theo sở thích hoặc mục đích đọc.
Ví dụ về các categories có thể là: Sách trẻ em, Sách giáo khoa, Sách tự truyện, Sách khoa học, Sách tiểu thuyết, và nhiều loại khác.

Genres (Thể loại):
Genres là cách phân loại sách thành các nhóm con hoặc thể loại cụ thể dựa trên nội dung, phong cách viết, và chủ đề của sách. 
Thể loại giúp người đọc hiểu rõ hơn về nội dung cụ thể của cuốn sách và có thể tìm kiếm sách theo sở thích thể loại.
Ví dụ về các genres có thể là: Kỳ dị, Lãng mạn, Hành động, Khoa học viễn tưởng, Kinh dị, Lịch sử, và nhiều thể loại khác.
Ví dụ để làm rõ sự khác biệt giữa categories và genres, bạn có thể nghĩ về một cuốn sách có categories là "Sách khoa học" và genres 
là "Khoa học viễn tưởng." Categories chỉ cho biết rằng đây là một cuốn sách thuộc lĩnh vực khoa học, trong khi genres cho biết cuốn sách 
nằm trong thể loại cụ thể của khoa học viễn tưởng với các yếu tố như hành tinh xa, công nghệ tương lai, và tình huống không thực tế.
*/
