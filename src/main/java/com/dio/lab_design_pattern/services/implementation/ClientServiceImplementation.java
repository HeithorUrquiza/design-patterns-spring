package com.dio.lab_design_pattern.services.implementation;

import com.dio.lab_design_pattern.models.Client;
import com.dio.lab_design_pattern.models.ClientAddress;
import com.dio.lab_design_pattern.models.repositories.ClientAddressRepository;
import com.dio.lab_design_pattern.models.repositories.ClientRepository;
import com.dio.lab_design_pattern.services.ClientService;
import com.dio.lab_design_pattern.services.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ClientServiceImplementation implements ClientService {
    //  Singleton: Injetar os componentes do Spring com @Autowired.
    //  Dependence Injection
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientAddressRepository addressRepository;
    @Autowired
    private ViaCepService viaCepService;

    //  Strategy: Implementar os métodos definidos na interface.
    //  Facade: Abstrair integrações com subsistemas, provendo uma interface simples.
    @Override
    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.get();
    }

    @Override
    public void insert(Client client) {
        saveClientWithCep(client);
    }

    @Override
    public void update(Long id, Client client) {
        Optional<Client> clientBD = clientRepository.findById(id);
        if (clientBD.isPresent()){
            saveClientWithCep(client);
        }
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    private void saveClientWithCep(Client client) {
        // Check if client address already exist
        String cep = client.getAddress().getCep();
        ClientAddress address = addressRepository.findById(cep).orElseGet(() -> {
            // If there's no cep, intregate with ViaCEP and create new data
           ClientAddress newAddress = viaCepService.consultCep(cep);
           addressRepository.save(newAddress);
           return newAddress;
        });
        client.setAddress(address);
        // Insert client with address into DB
        clientRepository.save(client);
    }
}

