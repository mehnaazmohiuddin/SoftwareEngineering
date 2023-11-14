package com.mehnaaz.makeadonation.repository;

import com.mehnaaz.makeadonation.model.Charity;
import jakarta.validation.constraints.Digits;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;


// this actually becomes an implementation cause its extending this class.
public interface CharityRepo extends ListCrudRepository<Charity, Integer> {

    public List<Charity> findAllByNameContains(String name);

}
