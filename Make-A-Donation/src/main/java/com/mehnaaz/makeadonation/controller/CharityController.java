package com.mehnaaz.makeadonation.controller;


import com.mehnaaz.makeadonation.model.Charity;
import com.mehnaaz.makeadonation.repository.CharityRepo;
import  com.mehnaaz.makeadonation.repository.CharityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/charity")
public class CharityController {

    final CharityRepo charityRepository;

    @Autowired
    public CharityController(CharityRepo charityRepository) {
        this.charityRepository = charityRepository;
    }
    //CRUD


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Charity get(@PathVariable  int id){
        try {
          return   charityRepository.findById(id).get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public  List<Charity> getAll(){
        return charityRepository.findAll();
    }


    @PostMapping("/donate")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Charity charity){
        charityRepository.save(charity);
    }

    @PostMapping("/{id}")
    public void update(@RequestParam Integer id, @RequestBody Charity charity){
        try {
            charityRepository.save(charity);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        charityRepository.deleteById(id);
    }

    @GetMapping("/filter/{name}")
    public List<Charity> filter(@PathVariable String name) {
        return charityRepository.findAllByNameContains(name);
    }
}
