package com.randstaddigital.workshop.delegate;

import com.randstaddigital.workshop.api.StationsApiDelegate;
import com.randstaddigital.workshop.mapper.BikeMapper;
import com.randstaddigital.workshop.mapper.StationMapper;
import com.randstaddigital.workshop.service.BikeService;
import com.randstaddigital.workshop.service.StationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StationsApiDelegateImpl implements StationsApiDelegate {

  private final StationService stationService;
  private final StationMapper stationMapper;
  private final BikeService bikeService;
  private final BikeMapper bikeMapper;
}
