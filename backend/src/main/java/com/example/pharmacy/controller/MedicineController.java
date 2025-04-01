package com.example.pharmacy.controller;

import com.example.pharmacy.model.Medicine;
import com.example.pharmacy.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicines")
@CrossOrigin
public class MedicineController {

  @Autowired
  private MedicineRepository medicineRepo;

  @GetMapping
  public List<Medicine> getAll() {
    return medicineRepo.findAll();
  }

  @PostMapping
  public Medicine create(@RequestBody Medicine medicine) {
    return medicineRepo.save(medicine);
  }
}
