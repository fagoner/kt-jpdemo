package com.jpdemo.demo.repositories

import com.jpdemo.demo.entities.Reservation
import org.springframework.data.jpa.repository.JpaRepository

interface ReservationRepository : JpaRepository<Reservation, Long>