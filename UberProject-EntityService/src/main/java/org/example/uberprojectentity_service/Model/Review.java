package org.example.uberprojectentity_service.Model;
import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "BookingReview")
public class Review extends BaseModel {

    @Column(nullable = false)
    private String content;

    private Double rating;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private Booking booking;
    
    public String toString(){return "Review :" + this.content +" " + this.rating + " " + this.createdAt;};

}
