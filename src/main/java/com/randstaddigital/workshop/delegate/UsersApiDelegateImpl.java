package com.randstaddigital.workshop.delegate;

import com.randstaddigital.workshop.api.UsersApiDelegate;
import com.randstaddigital.workshop.mapper.RentalMapper;
import com.randstaddigital.workshop.mapper.UserMapper;
import com.randstaddigital.workshop.service.RentalService;
import com.randstaddigital.workshop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersApiDelegateImpl implements UsersApiDelegate {

  private final UserService userService;
  private final UserMapper userMapper;
  private final RentalService rentalService;
  private final RentalMapper rentalMapper;
}
