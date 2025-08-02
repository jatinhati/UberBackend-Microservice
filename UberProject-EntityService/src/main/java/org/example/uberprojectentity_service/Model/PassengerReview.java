package org.example.uberprojectentity_service.Model;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PassengerReview extends BaseModel{

    private String PassengerReviewContent;

    private String PassengerRating;
}
