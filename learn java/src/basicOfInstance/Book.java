package basicOfInstance;
import java.util.*;

public class Book implements Comparable<Book>, Cloneable {
	private String title;
	private Date publishDate;
	private String comment;
	
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublishDate() {
		return this.publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (!(o instanceof Book)) return false;
		Book b = (Book) o;
		if (!this.title.equals(b.title) && !this.publishDate.equals(b.publishDate)) {
			return false;
		}
		return true;
	}
	public int hashCode() {
		return Objects.hash(this.title, this.publishDate, this.comment);
	}
	public int compareTo(Book obj) {
		return this.publishDate.compareTo(obj.publishDate); //©‘R‡˜‚ğŒÃ‚¢‡‚É‚·‚é
		}
	public Book clone() {
		Book b = new Book();
		b.title = this.title;
		b.publishDate = (Date) this.publishDate.clone();
		b.comment = this.comment;
		return b;
	
	}
	
	

}
