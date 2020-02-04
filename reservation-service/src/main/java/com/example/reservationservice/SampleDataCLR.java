package com.example.reservationservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
class SampleDataCLR  implements CommandLineRunner {

    private ReservationRepository reservationRepository;

    SampleDataCLR(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Stream.of("Josh", "Alex", "Anna").forEach(name -> this.reservationRepository.save(new Reservation(name)));
//        reservationRepository.findAll().forEach(System.out::println);
    }
}