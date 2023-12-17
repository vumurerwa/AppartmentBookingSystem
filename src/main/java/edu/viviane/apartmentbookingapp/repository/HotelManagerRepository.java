package edu.viviane.apartmentbookingapp.repository;

import edu.viviane.apartmentbookingapp.model.HotelManager;
import edu.viviane.apartmentbookingapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HotelManagerRepository extends JpaRepository<HotelManager, Long> {

    Optional<HotelManager> findByUser(User user);
}
