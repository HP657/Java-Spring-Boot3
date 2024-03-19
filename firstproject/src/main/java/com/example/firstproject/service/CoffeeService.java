package com.example.firstproject.service;

import com.example.firstproject.dto.CoffeeDto;
import com.example.firstproject.entity.Coffee;
import com.example.firstproject.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {
    @Autowired
    private CoffeeRepository coffeeRepository;
    public List<Coffee> index() {
        return coffeeRepository.findAll();
    }
    public Coffee show(long id) {
        return coffeeRepository.findById(id).orElse(null);
    }
    public Coffee create(CoffeeDto dto) {
        Coffee coffee = dto.toEntity();
        if (coffee != null) {
            return null;
        }
        return coffeeRepository.save(coffee);
    }
    public Coffee update(long id, CoffeeDto dto) {
        Coffee coffee = dto.toEntity();
        Coffee target = coffeeRepository.findById(id).orElse(null);
        if (target == null || id != coffee.getId()) {
            return null;
        }
        target.patch(coffee);
        Coffee updated = coffeeRepository.save(target);
        return updated;
    }
    public Coffee delete(long id) {
        Coffee target = coffeeRepository.findById(id).orElse(null);
        if (target == null) {
            return null;
        }
        coffeeRepository.delete(target);
        return target;
    }
}
