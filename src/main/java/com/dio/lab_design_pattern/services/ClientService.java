package com.dio.lab_design_pattern.services;

import com.dio.lab_design_pattern.models.Client;

public interface ClientService {
    Iterable<Client> findAll();
    Client findById(Long id);
    void insert(Client client);
    void update(Long id, Client client);
    void delete(Long id);
}
