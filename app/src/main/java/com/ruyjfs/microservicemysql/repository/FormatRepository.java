package com.ruyjfs.microservicemysql.repository;

import com.ruyjfs.microservicemysql.model.Format;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FormatRepository extends CrudRepository<Format, Long> {

    @Query("SELECT CASE WHEN COUNT(tbf)> 0 THEN true ELSE false END FROM Format tbf WHERE LOWER(tbf.format) LIKE LOWER(:value)")
    boolean existsFormat(@Param("value") String format);

    @Query(value = "SELECT f FROM Format f ")
    List<Format> test();
}
