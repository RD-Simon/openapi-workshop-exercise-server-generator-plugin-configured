package com.randstaddigital.workshop.delegate;

import com.randstaddigital.workshop.api.RentalsApiDelegate;
import com.randstaddigital.workshop.mapper.RentalMapper;
import com.randstaddigital.workshop.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentalsApiDelegateImpl implements RentalsApiDelegate {

  private final RentalService rentalService;
  private final RentalMapper rentalMapper;
}
