package fst.if5.cloud.projetMicroServices.book.model;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
public class Book {

	@Id
	private String id;	
    private String name;
    private String description;
    private String author;
    private String publisher;
	private BookType type;
    
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateAchat;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date releaseDate;
    
    private Integer copyNumber;
    private Integer availableCopyNumber;

   
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public BookType getType() {
		return type;
	}

	public void setType(BookType type) {
		this.type = type;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Integer getCopyNumber() {
		return copyNumber;
	}

	public void setCopyNumber(Integer copyNumber) {
		this.copyNumber = copyNumber;
	}

	public Integer getAvailableCopyNumber() {
		return availableCopyNumber;
	}

	public void setAvailableCopyNumber(Integer availableCopyNumber) {
		this.availableCopyNumber = availableCopyNumber;
	}



	public Book(String id, String name, String description, String author, String publisher, BookType type,
			Date dateAchat, Date releaseDate, Integer copyNumber, Integer availableCopyNumber) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.author = author;
		this.publisher = publisher;
		this.type = type;
		this.dateAchat = dateAchat;
		this.releaseDate = releaseDate;
		this.copyNumber = copyNumber;
		this.availableCopyNumber = availableCopyNumber;
	}
	
	
	public Book() {
		super();
	}
    
	/*
    @JsonIgnoreProperties({"book"})
    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
    private List<Reservation> reservations;*/
}