
/*package fst.if5.cloud.projetMicroServices.book.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.persistence.ManyToOne;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "Reservation")
public class Reservation {

	
    @JsonIgnoreProperties({"reservations"})
    @ManyToOne
    private Book book;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reservationStartDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reservationEndDate;


}*/