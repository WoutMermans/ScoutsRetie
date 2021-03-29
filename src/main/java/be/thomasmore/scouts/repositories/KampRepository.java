package be.thomasmore.scouts.repositories;

import be.thomasmore.scouts.model.Kamp;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface KampRepository extends CrudRepository<Kamp, Integer> {



    @Query("SELECT a FROM Kamp a " +
            "WHERE :word IS NULL OR LOWER(a.kampLocatie) LIKE LOWER(CONCAT('%',:word,'%'))" +
            "OR LOWER(a.kampInfo) LIKE LOWER(CONCAT('%',:word,'%'))" +
            "OR LOWER(a.kampDatum) LIKE LOWER(CONCAT('%',:word,'%'))" +
            "OR LOWER(a.kampLabel) LIKE LOWER(CONCAT('%',:word,'%'))")
    List<Kamp> findByall();

}