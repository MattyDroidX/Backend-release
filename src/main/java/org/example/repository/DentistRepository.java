package org.example.repository;

import org.example.model.Dentist;

import java.util.List;

public interface DentistRepository<T> {

    Dentist save(Dentist dentist);

    List<T>findAll();
    T findById(int id);
    void deleteById(int id);
    void deleteAll();

}
