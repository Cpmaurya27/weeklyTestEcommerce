package com.example.eCommerse.service;

import com.example.eCommerse.model.Address;
import com.example.eCommerse.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepository iAddressRepository;

    public Address createAddress(Address address) {
        return iAddressRepository.save(address);
    }

    public Optional<Address> getAddressById(Integer id) {
        return iAddressRepository.findById(id);
    }

    public List<Address> getAllAddresses() {
        return (List<Address>) iAddressRepository.findAll();
    }
}
