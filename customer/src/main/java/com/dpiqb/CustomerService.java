package com.dpiqb;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository repository) {
  public void registerCustomer(CustomerRegistrationRequest request) {
    Customer customer = Customer.builder()
      .firstName(request.firstName())
      .lastName(request.lastName())
      .email(request.email())
      .build();
    // TODO: validation - email valid
    // TODO: validation - email not taken
    repository.save(customer);
  }
}
