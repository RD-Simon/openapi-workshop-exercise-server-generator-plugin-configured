package com.randstaddigital.workshop.delegate;

import com.randstaddigital.workshop.api.BikesApiDelegate;
import com.randstaddigital.workshop.mapper.BikeMapper;
import com.randstaddigital.workshop.mapper.RentalMapper;
import com.randstaddigital.workshop.service.BikeService;
import com.randstaddigital.workshop.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BikesApiDelegateImpl implements BikesApiDelegate {

  private final BikeService bikeService;
  private final BikeMapper bikeMapper;
  private final RentalService rentalService;
  private final RentalMapper rentalMapper;
}
