package com.dpiqb;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
  private final CustomerRepository repository;
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
