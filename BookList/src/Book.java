import java.util.Date;

/**
 * Author: gunes
 * Project: BookList
 * E-mail: gunesserkan883@gmail.com
 * Creation Date: 3/17/2024 11:14 PM
 */
public class Book {
    private String name;
    private int pageCount;
    private String authorName;
    private Date realeaseDate;

    public Book(String name,int pageCount, String authorName, Date realeaseDate) {
        this.name = name;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.realeaseDate = realeaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getRealeaseDate() {
        return realeaseDate;
    }

    public void setRealeaseDate(Date realeaseDate) {
        this.realeaseDate = realeaseDate;
    }
}
