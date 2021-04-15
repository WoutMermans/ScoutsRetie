package be.thomasmore.scouts.repositories;

import be.thomasmore.scouts.model.Leiding;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LeidingRepository extends CrudRepository<Leiding, Integer> {


    @Query("SELECT a FROM Leiding a " +
            "WHERE :word IS NULL OR LOWER(a.leiderName) LIKE LOWER(CONCAT('%',:word,'%'))" +
            "OR LOWER(a.leiderLeeftijd) LIKE LOWER(CONCAT('%',:word,'%'))" +
            "OR LOWER(a.leiderBio) LIKE LOWER(CONCAT('%',:word,'%'))")
    List<Leiding> findByall();
}
