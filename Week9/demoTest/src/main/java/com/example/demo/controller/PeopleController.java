package com.example.demo.controller;

import com.example.demo.dto.PeopleModel;
import com.example.demo.entity.People;
import com.example.demo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;


    @GetMapping(value="/all")
    public List<People> getAllPeople() {
        return peopleService.getAllPeople();
    }

    @GetMapping("/{id}")
    public Optional<People> getById(@PathVariable("id") Integer id){
        return peopleService.getPeopleById(id);
    }


    @PostMapping("/add")
    public PeopleModel add(@RequestBody PeopleModel peopleModel) {
       peopleService.addPeople(peopleModel);
       return peopleModel;
    }


    @PutMapping("/{id}")
    public People updatePeople(@PathVariable("id") Integer id,@RequestBody PeopleModel peopleModel) throws  Exception{
        return peopleService.updateById(id,peopleModel);
    }


    @DeleteMapping("/{id}")
    public String deletePeople(@PathVariable("id") Integer id){
        peopleService.deleteById(id);
        return  "successfully deleted!";
    }

}
