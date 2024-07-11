package com.dio.lab_design_pattern.models.repositories;

import com.dio.lab_design_pattern.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Implement all CRUD actions
@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
