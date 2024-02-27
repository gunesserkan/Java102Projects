package Model;

import java.time.LocalDate;
import java.util.Date;

public class Book implements Comparable<Book>{
    private String name;
    private int pageCount;
    private String autHorName;
    private LocalDate publishDate;

    public Book(String name, int pageCount, String autHorName, LocalDate publishDate) {
        this.name = name;
        this.pageCount = pageCount;
        this.autHorName = autHorName;
        this.publishDate = publishDate;
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

    public String getAutHorName() {
        return autHorName;
    }

    public void setAutHorName(String autHorName) {
        this.autHorName = autHorName;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }
}
