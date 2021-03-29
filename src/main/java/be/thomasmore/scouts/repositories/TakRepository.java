package be.thomasmore.scouts.repositories;

import be.thomasmore.scouts.model.Tak;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TakRepository extends CrudRepository<Tak, Integer> {



    @Query("SELECT a FROM Tak a " +
            "WHERE :word IS NULL OR LOWER(a.takName) LIKE LOWER(CONCAT('%',:word,'%'))" +
            "OR LOWER(a.takInfo) LIKE LOWER(CONCAT('%',:word,'%'))" +
            "OR LOWER(a.takLeeftijd) LIKE LOWER(CONCAT('%',:word,'%'))")
    List<Tak> findByall();

}