package com.example.demo.service;

import com.example.demo.dto.PeopleModel;
import com.example.demo.entity.People;
import com.example.demo.repository.PeopleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeopleService {

    @Autowired
    private PeopleRepository peopleRepository;

    public List<People> getAllPeople(){
        return peopleRepository.findAll();
    }

    public Optional<People> getPeopleById(Integer id){
        return peopleRepository.findById(id);
    }

    public People addPeople(PeopleModel model){
        People people = new People(1,model.getName(),model.getAge(),model.getGender());
        return peopleRepository.save(people);
    }

    public void deleteById(Integer id) {
        peopleRepository.deleteById(id);
    }

    public People updateById(Integer id,PeopleModel model) throws Exception {
        return peopleRepository.findById(id)
                .map(updatePeople-> {
                    updatePeople.setName(model.getName());
                    updatePeople.setAge(model.getAge());
                    updatePeople.setGender(model.getGender());
                    return peopleRepository.save(updatePeople);
                }).orElseThrow( Exception::new);
    }


}
