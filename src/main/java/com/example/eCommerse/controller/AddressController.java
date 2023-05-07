package com.example.eCommerse.controller;

import com.example.eCommerse.model.Address;
import com.example.eCommerse.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping(value = "/addAddress")
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @GetMapping(value = "/getAddressById/{id}")
    public Optional<Address> getAddressById(@PathVariable Integer id) {
        return addressService.getAddressById(id);
    }

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

}
