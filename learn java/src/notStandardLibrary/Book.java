package notStandardLibrary;
import java.util.Date;

import org.apache.commons.lang3.builder.*;

//basicOfInstance��Book�N���X���C����������
//�����Ɣ��s���ƃR�����g�������ł���Γ����Ȃ��̂Ɣ��肷��
//��W���̃��C�u�����[���g�p���Ă���

public class Book implements Comparable<Book>, Cloneable{
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
	
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this );
	}
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}
	public int compareTo(Book o) {
		return CompareToBuilder.reflectionCompare(this, o, "comment", "title");
	}

}
