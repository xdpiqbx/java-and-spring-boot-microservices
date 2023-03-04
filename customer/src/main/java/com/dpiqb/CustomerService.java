package com.dpiqb;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CustomerService {
  private final CustomerRepository repository;
  private final RestTemplate restTemplate;
  public void registerCustomer(CustomerRegistrationRequest request) {
    Customer customer = Customer.builder()
      .firstName(request.firstName())
      .lastName(request.lastName())
      .email(request.email())
      .build();
    // TODO: validation - email valid
    // TODO: validation - email not taken

    repository.saveAndFlush(customer);
    // TODO: check - if fraudster
    FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
      "http://localhost:8081/api/v1/fraud-check/{customerId}",
      FraudCheckResponse.class,
      customer.getId()
    );
    if(fraudCheckResponse.isFraudster()){
      throw new IllegalStateException("fraudster");
    }
    // TODO: send notification
  }
}
