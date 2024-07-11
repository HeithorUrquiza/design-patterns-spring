package com.dio.lab_design_pattern.models.repositories;

import com.dio.lab_design_pattern.models.ClientAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientAddressRepository extends CrudRepository<ClientAddress, String> {
}
