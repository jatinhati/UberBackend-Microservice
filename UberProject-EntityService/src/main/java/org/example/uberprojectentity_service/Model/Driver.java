package org.example.uberprojectentity_service.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler" , "bookings"})
public class Driver extends BaseModel{

    @OneToMany(mappedBy ="driver",fetch = FetchType.LAZY)
    private List<Booking> bookings = new ArrayList<>();

    private String name;

    private String phoneNumber;

    @Column(nullable = false)
    private String licenseNumber;


}
